import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int n = in.nextInt();
		int end[] = new int [w + 1];
		int change[][] = new int [n][2];
		for(int i = 0;i < n;i++){
			String[] num = in.next().split(",");
			change[i][0] = Integer.valueOf(num[0]);
			change[i][1] = Integer.valueOf(num[1]);
		}
		for(int i = 1;i <= w;i++){
			int ans = i;
			for(int j = 0;j < n;j++){
				if(ans == change[j][0]){
					ans = change[j][1];
				}else if(ans == change[j][1]){
					ans = change[j][0];
				}
			}
			end[ans] = i;
		}
		for(int i = 1;i <= w;i++){
			System.out.println(end[i]);
		}
	}
}