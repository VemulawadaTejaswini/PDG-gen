import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> c = new ArrayList<Integer>();
		int mini = 9999;
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = 0; i < a; i++){
			int d = sc.nextInt();
			c.add(d);
		}
		Collections.sort(c);
		for(int i = 0; i < a; i+=2){
			if(i > a-2){
				break;
			}
			int f = c.get(i+2)-c.get(i);
			if(mini>f){
				mini = f;
			}
		}
		System.out.println(mini);
	}
}