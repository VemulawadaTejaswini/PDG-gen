import java.util.Scanner;

class main{

	public static void Main(String[] args) {




		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();


		String[][] a = new String[H][W]; 
		String[][] ans = new String[H][W]; 
		String[][] realans = new String[H][W]; 

		char[][] ss= new char[H][W];
		char[][] ssans= new char[H][W];
		char[][] ssrealans= new char[H][W];


		String s = new String();


		for(int i= 0;i < H;i++){
			s = scan.next();
			ss[i] = s.toCharArray();
		}

		int realH=H;

		int[] yokocheck = new int[H];

		for(int i =0;i < H;i++){

			for(int j= 0;j < W ;j++){


				if(ss[i][j] == '.'){
					yokocheck[i]++;
				}

			}
		}
		int tate=0;
		int yoko = 0;

		for(int i =0;i < H;i++){
			yoko = 0;
			for(int j= 0;j < W ;j++){


				if(yokocheck[i] != W ){
					ssans[tate][yoko] = ss[i][j];
					yoko++;
					if(j == W-1){
						tate++;
					}


				}else{
					
				}

			}

		}
		
		realH = tate;
		
//		for(int i= 0;i < H;i++){
//			for(int j= 0;j < W;j++){
//
//				System.out.print(ssans[i][j]);
//			}
//			System.out.println();
//		}


	

		tate = 0;
		yoko = 0;

		int[] tatecheck = new int[W];

		for(int i= 0;i < realH;i++){
			for(int j= 0;j < W ;j++){
				if(ssans[i][j]=='.'){
					tatecheck[j]++;			
				}


			}
		}

		for(int i= 0;i < realH;i++){
			yoko=0;
			for(int j= 0;j < W;j++){

				if(tatecheck[j] != realH){
					ssrealans[tate][yoko] = ssans[i][j];
					yoko++;
				}
			}
			tate++;

		}



		for(int i= 0;i < H;i++){
			for(int j= 0;j < W;j++){

				System.out.print(ssrealans[i][j]);
			}
			System.out.println();
		}


	}




}
