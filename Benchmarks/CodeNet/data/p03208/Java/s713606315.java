import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Long> c = new ArrayList<Long>();
		long mini = 1000000000;
		
		long a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = 0; i < a; i++){
			long d = sc.nextInt();
			c.add(d);
		}
		Collections.sort(c);
		for(int i = 0; i < a; i++){
			if(i > a-b+1){
				break;
			}
			long f = c.get(i+b-1)-c.get(i);
			if(mini>f){
				mini = f;
			}
		}
		System.out.println(mini);
	}
}