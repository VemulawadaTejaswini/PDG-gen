import java.util.*;
import java.util.Arrays;

public class Main {
	static int[] isOk = new int[10000];
	static int x;
	static int a;
	static int b;
	public static void main(String[] args){
		Arrays.fill(isOk, 0);
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		if(b-a<0){
			System.out.println("delicious");
		}else if(a-b>x){
			System.out.println("dangerous");
		}else{
			System.out.println("safe");
		}
	}
}
