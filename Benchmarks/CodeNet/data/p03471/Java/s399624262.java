import java.util.Scanner;

public class C85 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
	int Y = Integer.parseInt(sc.next());
	int num10000;
	int num5000;
	int num1000;
	int sum;
	int cnt = 0;
	
	for(int i=0; i <= N; i++) {
	    for(int j=0; j <= N-i; j++) {
		for(int k=0; k <= N-i-j; k++) {
		    sum = 10000*i + 5000*j + 1000*k;
		    System.out.println(sum);
		    if(sum == Y) {
			cnt++;
		    }
		}
	    }
	}
	System.out.println(cnt);
    }
}
