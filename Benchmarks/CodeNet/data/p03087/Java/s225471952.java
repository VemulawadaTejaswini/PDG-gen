import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        int n=input.nextInt();
        
        ArrayList <Integer>ind=new <Integer>ArrayList();
        
        int q=input.nextInt();
        
        System.out.flush();
        
        String str=input.next();
        
        
        for(int i=0;i<n-1;i++)
        {
            if(str.charAt(i)=='A'&& str.charAt(i+1)=='C')
            {
                ind.add(i);
            
            }
        
        
        
        }
        
        
        for(int i=0;i<q;i++)
        {
            int count=0;
            int l=input.nextInt();
            int r=input.nextInt();
            
            if(l==1&&r==n)
                System.out.println(ind.size());
            else{
            for(int j=0;j<ind.size();j++)
            {
                if(((ind.get(j)>=l-1)&&(ind.get(j)<=r-1))&&((ind.get(j)+1>=l-1)&&(ind.get(j)+1<=r-1)))
                    count++;
                if(ind.get(j)>r-1)
                    break;
            }
            System.out.println(count);
            
            }
        }
        
        
        
    }
    
}