import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int result,x,result2,y;
		int mov = 0;
		int ikisaki[][] = new int[n][2];
		for(int i = 0; i < n; i++){
			for(int k = 0; k < 2; k++){
				ikisaki[i][k] = sc.nextInt();
			}
		}
		for(int i = 1; i < n; i++){
			result = ikisaki[i][0] - ikisaki[i-1][0];
			x = Math.abs(result);
			result2 = ikisaki[i][1] - ikisaki[i-1][1];
			y = Math.abs(result2);
			mov = mov + x + y;
			if(result > 0 && result2 > 0 || result < 0 && result2 < 0){
				if(x <= y){
					mov = mov - x;
				}else{
					mov = mov - y;
				}
			}
		}
		System.out.println(mov);
	}
}