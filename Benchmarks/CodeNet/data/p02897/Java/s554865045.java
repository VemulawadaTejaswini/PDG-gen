//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
       int n=s.nextInt();
      int num=0;
      if(n%2==0)
        num=n/2+1;
      else
        num=n/2;
      
      double ans=(double)num/(double)n;
      
      System.out.format("%.10f",ans);
      
        // Write your code here

    }
}
