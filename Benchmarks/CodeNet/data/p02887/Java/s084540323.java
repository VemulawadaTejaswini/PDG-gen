import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		char judge =' ';
		int res = 0;
		for(int i = 0 ; i<input.length(); i++){
			if(input.charAt(i)!=judge){
				res++;
			}
			judge = input.charAt(i);
		}
		System.out.println(res);
	}
}
