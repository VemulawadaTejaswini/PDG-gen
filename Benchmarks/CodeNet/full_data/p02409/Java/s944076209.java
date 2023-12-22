import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int room1[][] = new int[3][10];
		int room2[][] = new int[3][10];
		int room3[][] = new int[3][10];
		int room4[][] = new int[3][10];
		int n = x.nextInt();
		for( int a = 0 ; a < 3 ; a++){
			for(int t = 0 ; t <10 ; t++){
				room1[a][t] = 0;
				room2[a][t] = 0;
				room3[a][t] = 0;
				room4[a][t] = 0;
			}
		}
		int b ;
		int f ;
		int r ;
		int v ;
		for( int i = 0 ; i < n ; i++){
			b = x.nextInt();
			f = x.nextInt();
			r = x.nextInt();
			v = x.nextInt();
			if(b == 1){
				room1[f-1][r-1]+= v;
			}else if(b ==2){
				room2[f-1][r-1]+= v;
			}else if( b== 3){
				room3[f-1][r-1]+= v;
			}else{
				room4[f-1][r-1]+= v;
			}
		}
		for(int d = 0 ; d <3 ; d++){
			for( int c = 0 ; c < 10 ; c++){
			System.out.print(" " + room1[d][c]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for(int d = 0 ; d <3 ; d++){
			for( int c = 0 ; c < 10 ; c++){
			System.out.print(" " + room2[d][c]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for(int d = 0 ; d <3 ; d++){
			for( int c = 0 ; c < 10 ; c++){
			System.out.print(" " + room3[d][c]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for(int d = 0 ; d <3 ; d++){
			for( int c = 0 ; c < 10 ; c++){
			System.out.print(" " + room4[d][c]);
			}
			System.out.println();
		}
	}
}