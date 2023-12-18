import java.beans.Introspector;
import java.util.*;
final class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long n = 100000;// s.nextLong();
    long a = 45;//s.nextLong();
    long b = 35736;//s.nextLong();
    
    if((b-a)%2==0)
        System.out.println(((b-a)/2));
    else{
        //long ans = Math.min(n-a, b-1);
        //System.out.println( Math.min(ans, ((b-a)/2)+2));
        //System.out.println( "ans");

        System.out.println( Math.min(a-1,n-b)+1 +((b-a-1)/2));


    }
    
  }
}