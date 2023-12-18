import java.util.*;
public class Main {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int n = sc.nextInt();
	int k = sc.nextInt();
	double p[] = new double[n];
	double f = 0.0;
	for (int i = 0; i < n; i++) {
		double wk = (1.0 + sc.nextInt())/2.0;
		for (int j = 0; j < k; j++) {
			if ((i-j) < 0) {
              continue;
			} else {
			  p[i-j]+=wk;
			  if (f<p[i-j]){
			    f=p[i-j];
			  }				
			}
		}
	}
	System.out.println(f);
  }
}

