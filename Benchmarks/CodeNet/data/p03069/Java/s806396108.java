import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String S = sc.next();
		String li[] = S.split("");
		int count = 0;
		
		for(int i=0;i<N-1;i++) {
			if(li[i].equals("#")&&li[i+1].equals(".")) {
				count++;
			}
		}
		System.out.println(count);
	}
}