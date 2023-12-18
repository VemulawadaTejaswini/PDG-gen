import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
      	double B = sc.nextDouble();
      	long N = sc.nextLong();
      	double ans = 1;
      	for(int x=0;x<=N;x++){
          double p1 = Math.floor(A*x/B);
          double p2 = A * Math.floor(x/B);
          double p = p1 - p2;
          ans = Math.max(ans, p);
        }

      	int c = (int)ans;
       	System.out.println(c);
    }
}