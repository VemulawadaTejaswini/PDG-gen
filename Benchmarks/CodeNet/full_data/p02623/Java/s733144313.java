import java.io.*; 
import java.util.*; 
  
 class Main 
{ 
    public static void main(String args[]) 
    { 
      //  try{
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        long k=sc.nextLong();
        ArrayList<Long> a=new ArrayList<>((int)n);
        ArrayList<Long> b=new ArrayList<>((int)m);
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