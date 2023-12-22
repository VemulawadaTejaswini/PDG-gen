import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = Integer.parseInt(scan.nextLine());
			if(n == 0){
				break;
			}
			String[] str[] = new String[n+1][];
			for(int i = 0;i < n+1;i++){
				str[i] = scan.nextLine().split(" ");
			}
			int[] lim = new int[4];
			for(int i = 0;i < 4;i++){
				lim[i] = Integer.parseInt(str[n][i]);
			}
			int[] a = {4,9,4};
			boolean sw = true;
			int ca;
			int j;
			for(int i = 0;i < n;i++){
				ca = 0;
				for(j = 1;j < 4;j++){
					int t = Integer.parseInt(str[i][j]);
					if(t > lim[j-1]){
						break;
					}
					ca += t*a[j-1];
				}
				if(j == 4 && ca <= lim[3]){
					System.out.println(str[i][0]);
					sw = false;
				}
			}
			if(sw){
				System.out.println("NA");
			}
		}
	}
}