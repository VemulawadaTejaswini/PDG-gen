import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] list = new int[N];
		for(int i=0;i<N;i++) {
			list[i] = in.nextInt();
		}
		int count =0;
		Boolean flag =true;
		while(flag) {
			for(int i=0;i<N;i++) {
				list[i] = list[i]/2;
				if(list[i]%2==1) {
					flag=false;
				}
			}
			count++;
		}
		System.out.println(count);
	}
}
