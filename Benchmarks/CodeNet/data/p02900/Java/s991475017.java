import java.util.*;



public class Main{
  static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
  static boolean prime(long n) {

      for(int i = 2; i < n/2+1; i++) {
          if(n % i == 0) {
              return false;
          }
      }
      return true;
  }



  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();

    long m = gcd(a,b);
    int count =0;
    ArrayList<Integer> list = new ArrayList<Integer>();

    for(int i=1; i<=m; i++){
      if(m%i==0){
        //count += 1;
        if(prime(i)){
          list.add(i);
        }

      }
    }
    //System.out.println(m);
    //System.out.println(count);
    //System.out.println(list);
    int l = list.size();
    //System.out.println(l);

    System.out.println(l);

  }
}