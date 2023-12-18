import java.util.*;

class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int A = sc.nextInt();
	int B = sc.nextInt();
	int res = 0;

	for(int i = 1; i <= N; i++) {
	    int sum = 0;
	    for(int m = i; m > 0; m /= 10) {
		sum += m % 10;
	    }
	    if(sum >= A && sum <= B) {
		res += i;
	    }
	}
	
	System.out.println(res);
    }
}
