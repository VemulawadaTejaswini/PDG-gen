import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		char[] s = seer.next().toCharArray();
		int res = 0;
		for(char c: s){
			if(c == '+') res++;
			else res--;
		}
		System.out.println(res);
	}

}
