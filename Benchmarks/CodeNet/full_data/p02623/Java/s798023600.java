import java.io.*; 
import java.util.*; 
  
 class Main 
{ 
    public static void main(String args[]) 
    { 
      //  try{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Long> a=new ArrayList<>(n);
        ArrayList<Long> b=new ArrayList<>(m);
        for(int i=0;i<n;i++)
        a.add(sc.nextLong());
        for(int i=0;i<m;i++)
        b.add(sc.nextLong());
        long c=0,ans=0;
        while(true){
            if(a.size()!=0&&b.size()==0){
                ans=ans+a.get(0);
                if(ans>k)
                break;
                a.remove(0);
                c++;
            }
            else if(a.size()==0&&b.size()!=0){
                 ans=ans+b.get(0);
                if(ans>k)
                break;
                b.remove(0);
                c++;
            }
            else if(a.size()==0&&b.size()==0)
            break;
            else if(a.get(0)<b.get(0)){
                ans=ans+a.get(0);
                if(ans>k)
                break;
                a.remove(0);
                c++;
            }
            else{
                ans=ans+b.get(0);
                if(ans>k)
                break;
                b.remove(0);
                c++;
            }
        }
        System.out.println(c);
      //  }catch(Exception e)
      //  {
      //      return;
     //   }
    } 
} 