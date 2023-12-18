import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String[] list = sc.nextLine().split(" ");
		sc.close();
		int cnt = 0;
		for(int i=0;i<list.length;i++) {
			if(list[i] == null) continue;
			int n = Integer.parseInt(list[i]);
			if(list[n-1] == null) continue;
			if(Integer.parseInt(list[n-1]) == i+1) {
				cnt++;
				list[n-1] = null;
			}
		}
		System.out.print(cnt);
	}
}