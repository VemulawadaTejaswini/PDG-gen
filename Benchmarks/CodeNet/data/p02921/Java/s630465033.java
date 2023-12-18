import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		int cnt = 0;
		for(int i = 0 ; i<3; i++){
			if(input1.charAt(i)==input2.charAt(i))cnt++;
		}
		System.out.println(cnt);
	}
}
