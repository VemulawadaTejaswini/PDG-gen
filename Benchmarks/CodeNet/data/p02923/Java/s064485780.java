import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long be=sc.nextLong(),buff;
		long count=0,max=0;

		for(int i=1;i<n;i++) {
			buff=sc.nextInt();
			if(buff<=be) {
				count++;
			}else {
				max=Math.max(max, count);
				count=0;
			}
			be=buff;
		}

		System.out.println(Math.max(max, count));
	}
}

