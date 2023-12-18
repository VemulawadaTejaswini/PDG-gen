import java.util.*;

public class Main{
    public static void main(String[] args) {
      FastScanner sc = new Scanner(System.in);

      long A=sc.nextLong();
      long B=sc.nextLong();
      long C=sc.nextLong();
      long D=sc.nextLong();
      long cnt=0;

      for(long i=A;i<=B;i++){
        if(i%C!=0 && i%D!=0){
            cnt++;
        }
      }


      System.out.println(cnt);


    }
}
