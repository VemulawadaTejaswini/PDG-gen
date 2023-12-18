import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			String s = sc.next();
			int R = 0, B = 0;
			for(int i = 0; i < N; i++) {
				if(s.charAt(i) == 'R') R++;
				else B++;
			}
			System.out.println(R > B ? "Yes" : "No");
		}
	}
}