import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		String yohou[] = sc.nextLine().split("");
		String zisseki[] = sc.nextLine().split("");

		int cnt = 0;
		for(int i = 0;i < yohou.length ;i++) {
			cnt += (yohou[i].equals(zisseki[i])) ? 1 : 0;
		}
		System.out.println(cnt);
	}
}