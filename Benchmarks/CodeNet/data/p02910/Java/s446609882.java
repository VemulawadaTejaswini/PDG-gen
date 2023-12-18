import java.util.*;

public class Main

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] input = sc.nextLine().toCharArray();
		for(int i = 0;i<input.length;i++) {

			if(i%2==0&&input[i]!='R'&&input[i]!='U'&&input[i]!='D') {
				//System.out.println(input[i]+"hit"+i);
				System.out.println("No");
				return;
			}else if(i%2!=0&&input[i]!='L'&&input[i]!='U'&&input[i]!='D') {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");

	}

}
