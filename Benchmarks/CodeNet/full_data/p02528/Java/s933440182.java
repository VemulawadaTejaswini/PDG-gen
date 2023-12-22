//\[g·évOiÌlÍ1000Èºj
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] num = new int[n];
		for(int i=0; i < n; i++){
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		for(int i=0; i < n- 1; i++){
			System.out.print(num[i] + " ");
		}
		System.out.println(num[n-1]);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}