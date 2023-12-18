import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int ans = 0;

	for(int i = 0; i<N; i++) {
	    int a = sc.nextInt();
	    while(a%2 == 0){
		a /= 2;
		ans++;
	    }
	}
	System.out.println(ans);

    }
}