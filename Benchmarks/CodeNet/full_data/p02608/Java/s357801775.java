import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    var N = Integer.parseInt(str);
    int ans = 0;
    double x,y,z;
    int a;
    double b;

    for (var i = 1;i <= N;i++) {
      ans = 0;
      a = (int)Math.sqrt(N);

      for (x = 1; x <= a; x++){
        for (y = 1; y <= a; y++){
          for (z = 1; z <= a; z++){
	     b = Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)+(x*y)+(y*z)+(z*x);
	     if( (int)b == i ){
		     ans++;
	     }
	  }
	}
      }


      System.out.println(ans);
    }

    scan.close();
  }
}