import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int m = sc.nextInt();
      	int a[] = new int[m];
      	for (int i = 0; i < m; i++){
          	a[i] = sc.nextInt();
        }
        int s = fib(a[0] - 1);
      	for (int i = 0; i < m-1; i++){
          	s = s * fib(a[i+1] - a[i]);
        }
		System.out.println(s%1000000007);
	}
  	public static int fib(int n){
      	int f0 = 0;
      	int f1 = 1;
      	int fn = f0 + f1;
      	for (int i = 2; i <= n; i++){
          	fn = f0 + f1;
            f0 = f1;
          	f1 = fn;
        }
        return fn;
    }
}