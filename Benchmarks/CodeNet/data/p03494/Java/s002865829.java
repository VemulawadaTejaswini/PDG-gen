import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int ans = 0;

		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.next());

		for(int i = 0; i < n; i++){
			int count = 0;
			String s2 = scan.next();
			int youso = Integer.parseInt(s2);

			while (0 == (youso % 2)) {
				youso = youso / 2;
				count++;
			}

			if(i == 0){
				ans = count;
			}else{
				if(ans > count){
					ans = count;
				}
			}
		}

		System.out.println(ans);
	}

}
