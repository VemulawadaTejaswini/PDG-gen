import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	int a, b, k;
    	while(true){
    		int cnt = 0;
    		a = in.nextInt();
    		b = in.nextInt();
    		k = a + b;
    		if(k <= 0)break;
    		while(k > 0){
    			k = k / 10;
    			cnt = cnt + 1;
    		}
    		System.out.println(cnt);
    	}
    }
}