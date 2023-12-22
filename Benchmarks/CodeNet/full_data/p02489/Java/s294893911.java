import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int cnt=1;
		while(true){
			int input = a.nextInt();
			if(input == 0)break;
			System.out.println("Case "+cnt+": "+input);
			cnt++;
		}
	}
}