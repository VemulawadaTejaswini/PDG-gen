import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int X = sc.nextInt();
      	int M;
      	int m = 8;
      	if ((X>=400)&&(X<600)) {
          	M = m;
        } else if ((X>=600)&&(X<800)) {
          	M = m - 1;
        } else if ((X>=800)&&(X<1000)) {
          	M = m - 2;
        } else if ((X>=1000)&&(X<1200)) {
          	M = m - 3;
        } else if ((X>=1200)&&(X<1400)) {
          	M = m - 4;
        } else if ((X>=1400)&&(X<1600)) {
          	M = m - 5;
        } else if ((X>=1600)&&(X<1800)) {
          	M = m - 6;
        } else {M = m - 7;}
      
      	System.out.println(M);
	}
}