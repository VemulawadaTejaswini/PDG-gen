import java.util.*;
 
 
class Main {
 
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
       
        int n = in.nextInt();
        in.nextLine();
        String arr[] = new String[n];
        for(int i=0;i<arr.length;i++)
        arr[i] = "";
        
        while(n>0){
            //boolean c=false;
            String s = in.nextLine();
            for(int i=0;i<arr.length;i++)
            {   
                if(arr[i].equals(s)) break;
                if(arr[i]==""){
                arr[i]=s; break;}
            }
            n--;
        }
        int f=0;

    
        while(arr[f]!=""&&f<arr.length)
        {
            
            f++;
        }
        System.out.println(f);
    }
}