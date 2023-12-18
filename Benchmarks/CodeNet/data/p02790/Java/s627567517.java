import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = Math.min(a,b);
		int max = Math.max(a,b);
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < max;i++){
			sb.append(String.valueOf(min));
		}
		System.out.println(sb.toString());
	}
}