import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int min = 10000;
		for(int i=0; i<s.length()-3; i++){
			min = Math.min(Math.abs(753-Integer.parseInt(s.substring(i, i+3))), min);
		}
		System.out.println(min);
	}
}