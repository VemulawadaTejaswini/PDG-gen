import java.util.*;
public class Main {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int n = sc.nextInt();
	int k = sc.nextInt();
	int p[] = new int[n];
	for (int i = 0; i < n; i++) {
		p[i] = sc.nextInt();
	}
	int max = 0;
	int maxp = 0;
	for (int i = 0; i < (n - k + 1); i++) {
	  int wkmax = 0;
	  for (int j = 0; j < k; j++) {
        wkmax+=p[i+j];
	  }
	  if (wkmax > max) {
	  	max = wkmax;
	  	maxp = i;
	  }
	}

    double f = 0.0;
    for (int j = maxp; j < k+maxp; j++) {
      f = f + (1.0 + p[j])/2;
    }
	System.out.println(f);
  }
}








