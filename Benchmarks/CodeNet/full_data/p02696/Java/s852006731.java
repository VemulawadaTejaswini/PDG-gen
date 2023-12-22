import java.util.*;
import java.math.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
      	int n = Integer.parseInt(sc.next());
        double ans =0;
        double tmp;
        for(int i=1;i<n+1; i++){
          tmp= Math.floor((double) a*i/b )+ (double)a* Math.floor((double) i/b);
          if (tmp > ans){ans=tmp;}
          
        }
      System.out.println((int)ans);
    }
}