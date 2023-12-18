import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int[] a = new int[n];
	for(int i = 0; i < n; i++){
	    a[i] = scan.nextInt();
	}
	
	//最大公約数の配列
	int[] gcd = new int[n];

	//端の処理
	gcd[0] = ruisekiGcd(a, 1, n);
	gcd[n-1] = ruisekiGcd(a, 0, n-1);
	
	//累積GCDを作成
	int l_gcd = 0;
	int r_gcd = 0;
	for(int i = 1; i < n-1; i++){
	    l_gcd = ruisekiGcd(a, 0, i);
	    r_gcd = ruisekiGcd(a, i+1, n);
	    gcd[i] = getGcd(l_gcd, r_gcd);
	}

	//累積GCDの最大値を計算
	int maxGcd = -1;
	for(int i = 0; i < n; i++){
	    if(maxGcd < gcd[i]){
		maxGcd = gcd[i];
	    }
	}

	System.out.println(maxGcd);
    }

    static int ruisekiGcd(int[] a, int s, int l){
	int gcd = a[s];
	for(int i = s+1; i < l; i++){
	    gcd = getGcd(gcd, a[i]);
	}
	return gcd;
    }

    static int getGcd(int a, int b){
	if(a < b){
	    int tmp = a;
	    a = b;
	    b = tmp;
	}

	while(b != 0){
	    int tmp = a % b;
	    a = b;
	    b = tmp;
	}
	
	return a;
    }
}
