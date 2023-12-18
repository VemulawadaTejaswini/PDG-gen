import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] tx = new int[n];
		for(int i = 0; i < n; i++){
			tx[i] = sc.nextInt();
		}
		if(n == 1){
			System.out.print((int)(Math.abs(tx[0]-x)));
		}else{
			class Main2{
				public int ab(int a,int b){
					return a%b==0?b:ab(b,a%b);
				}
			}
			Main2 main2 = new Main2();
			int num = (int)(Math.abs(tx[0]-x));
			for(int i = 1; i < n; i++){
				 num = main2.ab(num,(int)(Math.abs(tx[i]-x)));
			}
			System.out.print(num);
		}
	}
}
