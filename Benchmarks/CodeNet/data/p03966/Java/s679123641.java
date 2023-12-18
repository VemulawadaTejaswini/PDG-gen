import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arrays = new int[n][2];
		for(int i =0;i<n;i++){
			arrays[i][0] = in.nextInt();
			arrays[i][1] = in.nextInt();
		}
		int x = arrays[0][0];
		int y = arrays[0][1];
		for(int i = 1;i<n;i++){
			while(x*arrays[i][1]!=y*arrays[i][0]){
				while(x*arrays[i][1]<y*arrays[i][0]){
					x++;
				}
				while(x*arrays[i][1]>y*arrays[i][0]){
					y++;
				}
			}
		}
		System.out.println(x+y);

	}
}
