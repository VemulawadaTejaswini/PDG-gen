import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long A = Long.parseLong(sc.next());
      long B = Long.parseLong(sc.next());

      //F(A,B) = F(0,A-1) ^ F(0,B)

      long a = aaa(A-1);
      long b = aaa(B);

      System.out.println(a^b);

    }

    public static long aaa(long x){
      long ans = 0;
      long kk = 0;
      if(x%2==1 && ((x+1)/2)%2==0){ //odd
        ans = 0;
      }
      else if(x%2==1 && ((x+1)/2)%2==1){ //odd
        ans = 1;
      }
      else if(x%2==0 && (x/2)%2==0){
        ans = x;
      }
      else if(x%2==0 && (x/2)%2==1){
        ans = x^1;
      }
      return ans;
    }

}
