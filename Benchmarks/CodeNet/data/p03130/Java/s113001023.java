import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int[] cnt = new int[5];
			for(int i = 0; i < 3; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				cnt[a]++; cnt[b]++;
			}
			if(cnt[1] < 3 && cnt[2] < 3 && cnt[3] < 3 && cnt[4] < 3) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}