import java.util.*;
public class Main {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int n = sc.nextInt();
	int k = sc.nextInt();
	double p[] = new double[n];
	for (int i = 0; i < n; i++) {
		p[i] = (1.0 + sc.nextInt())/2.0;
	}
	double res[] = new double[n-k+1];

    double f = 0.0;
	for (int i = 0; i < res.length; i++) {
	  for (int j = 0; j < k; j++) {
        res[i]+=p[i+j];
	  }
      if (res[i]>f) {
      	f=res[i];
      }
	}
	System.out.println(f);
  }
}
