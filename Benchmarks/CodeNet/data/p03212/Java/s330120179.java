import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int ans = 0;
		for (int i = 0; i < n; i++){
			boolean flag[] = new boolean[3];
			for (int j = 0; j < 3; j++)
				flag[j] = false;
			
			int d = i;
			while (d % 10 == 7 || d % 10 == 5 || d % 10 == 3){
				if (d % 10 == 7)
					flag[0] = true;
				else if (d % 10 == 5)
					flag[1] = true;
				else if (d % 10 == 3)
					flag[2] = true;
				d /= 10;
			}
			
			if (d == 0 && flag[0] && flag[1] && flag[2])
				ans++;
		
		}
		
		System.out.println(ans);
		
	}

}