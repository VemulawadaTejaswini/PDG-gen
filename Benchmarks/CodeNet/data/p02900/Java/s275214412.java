import java.util.*;



public class Main{
  static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}



  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();

    long m = gcd(a,b);
    if(m==1){
      System.out.println(1);
    }else{
      int count =1; //1は事前にカウント

      if(m%2==0){
        count +=1; //素数2のカウント
        m = m/2;
        while(m%2==0){
          m = m/2;
        }
      }
      for(int i=3; i<=Math.sqrt(m); i+=2){
        if(m%i==0){
          count +=1;
          while(m%i==0){
            m = m/i;
          }
        }
        if(m>2){
          count+=1; //m =3,5,7の時for分でカウントされない分
        }


      }
      System.out.println(count);
    }



  }
}