import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	long n = sc.nextLong();
	long p = sc.nextLong();

	long ans = 1;
	long cnt;

	for(int i = 2; Math.pow(i, n) <= p;i++){

	    cnt = 0;
	    for(;;){
		if(p % i == 0){
		    cnt++;
		    p /= i;
		}else{
		    for (int j = 1; j <= cnt / n; j++){
			ans *= i;
		    }
		    break;
		}
	    }
	}
 
	System.out.println(ans);
    }
}
 