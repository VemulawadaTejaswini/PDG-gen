import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] list = sc.next().toCharArray();
		int ans = 0, check = 0;
		for(int i = 0; i < list.length; i++) {
			if(list[i] == 'A' || list[i] == 'C' || list[i] == 'G' || list[i] == 'T' ) {
				check++;
			}else {
				if(check > ans) { 
					ans = check;
				}
				check = 0;
			}
		}
		System.out.println(ans);
	}
}