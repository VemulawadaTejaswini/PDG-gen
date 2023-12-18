import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int dis = Math.abs(a-b);
		int count = 0;
		if(dis%2==0) {
		while(dis != 0) {
			a++;
			b--;
			dis = Math.abs(a-b);
			count++;
		}
		System.out.println(count);
		}
		else {
			int b_dis = n-b;
			int a_dis = a-1;
			if(a_dis<=b_dis) {
				count = b-1;
			}
			else {
				count = n-a;
			}
		}
		System.out.println(count);
	}
}