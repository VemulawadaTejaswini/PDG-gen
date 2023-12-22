import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String line=sc.nextLine();

			StringBuilder sb = new StringBuilder(line);
			int a=sc.nextInt();
			for(int i=1; i<=a; i++){
				int b=sc.nextInt();
				String temp=sb.substring(0,b);
				sb.append(temp);
				sb.delete(0, b);

			}
			System.out.println(sb);

		}

	}
}
