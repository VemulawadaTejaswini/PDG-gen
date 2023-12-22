import java.util.*;

public class Main{
	public static void main(String[] args){
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();
		int cnt = 0;
		for(int i = a; i <= b; i++){
			if(c % i == 0){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}