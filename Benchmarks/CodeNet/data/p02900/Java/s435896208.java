import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long a=sc.nextLong();
    long b=sc.nextLong();
    long gcd=gcd(a,b);
    List<Long> list=new ArrayList<>();
    long count=0;
    boolean ans=true;

    for(int i=1;i<gcd;i++){
      if(gcd%i==0){
        list.add(gcd/i);
      }
    }

    Iterator it=list.iterator();

    for(long i=0;it.hasNext();i++){
      ans=true;
      Long usagi=(Long)it.next();
      for(int k=2;k<usagi;k++){
        if(usagi%k==0){
          ans=false;
          break;
        }
      }
      if(ans==true){
        count++;
      }
    }
    System.out.println(count+1);

        
   
    }
    static long gcd (long a, long b) {
      long temp;
      while((temp = a%b)!=0) {
        a = b;
        b = temp;
      }
      return b;
    }
}