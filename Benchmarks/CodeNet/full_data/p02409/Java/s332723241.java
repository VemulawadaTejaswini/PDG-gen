import java.util.*;

public class Main{

	static int[][] tou1 = new int[3][10];
	static int[][] tou2 = new int[3][10];
	static int[][] tou3 = new int[3][10];
	static int[][] tou4 = new int[3][10];
	
	static void Output(int[][] tou,int last){
		for(int x = 0 ; x < 3 ; x++){
			for(int y = 0; y < 10 ; y++){
				System.out.print(" " + tou[x][y]);
			}
			System.out.println();
		}
		for(int i = 0 ; i < 20 ; i++){
			if(last == 1){break;}
			System.out.print("#");
		}
		if (last != 1) {
			System.out.println();
		}
		
	}
	
	static void Jouhou(int b,int f,int r,int v){
		switch(b){ 
		case 1: tou1[f-1][r-1]=tou1[f-1][r-1]+v;	break;
		case 2: tou2[f-1][r-1]=tou2[f-1][r-1]+v;	break;
		case 3: tou3[f-1][r-1]=tou3[f-1][r-1]+v;	break;
		case 4: tou4[f-1][r-1]=tou4[f-1][r-1]+v;	break;
		}
	}
	
	
	static void Input(){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i = 0; i < N ; i++){
			int b = scanner.nextInt();
			int f = scanner.nextInt();
			int r = scanner.nextInt();
			int v = scanner.nextInt();
			Jouhou(b, f, r, v);
		}
		scanner.close();
		
	}
	
	public static void main(String[] args) {
		Input();
		
		Output(tou1, 0);
		Output(tou2, 0);
		Output(tou3, 0);
		Output(tou4, 1);
	}

}