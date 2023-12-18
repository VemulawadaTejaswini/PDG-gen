import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int n = sc.nextInt();
	int h = sc.nextInt();
	int w = sc.nextInt();

	int ans = 0;

	int a;
	int b;
	for ( int i = 1; i <= n; i++ ){
	    a = sc.nextInt();
	    b = sc.nextInt();
	    if(a >= h && b >= w){
		ans++;
	    }
	}

	System.out.println(ans);
    }
}


