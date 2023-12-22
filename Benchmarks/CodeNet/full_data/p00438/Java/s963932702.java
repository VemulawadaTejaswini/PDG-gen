import java.util.*;
	
	/**
	 * @param sc 			ÇÝÝÏ
	 * @param field			¹ð\·zñ
	 * @param a, b 			¡Æc
	 * @param construction 	HÌð·_Ì
	 */
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int field[][];
	static int a,b;
	static int construction = 0;
	
	
	public static void main(String[] args) {
		while(read()){
			System.out.println(slove());
			/*for(int i = 0; i < b+2; i++){
				for(int j = 0; j < a+2; j++){
					System.out.print(field[i][j]+"        ");
				}
				System.out.println();
			}*/
		}
	}
	
	static boolean read(){
		/**
		 * XÌÇÝÝB
		 * àµA^eRÆàÉOÈçI¹³¹éB
		 */
		a = sc.nextInt(); b = sc.nextInt();
		if(a == 0 && b == 0)
			return false;
		
		/**
		 * XÌ¶¬Æú»B
		 *@-1Åzñðú»µÄAÀÛÌ¹ð0Åú»B
		 */
		field = new int[b+2][a+2];
		for(int i = 0; i < b+2; i++){
			for(int j = 0; j < a+2; j++){
				field[i][j] = -1;
			}
		}
		
		for(int i = 1; i <= b; i++){
			for(int j = 1; j <= a; j++){
				field[i][j] = 0;
			}
		}
		
		field[b][1] = 1;
		/*for(int i = 1; i<=a; i++){
			field[b][i] = 1;
		}
		for(int i = b; i>=1; i--){
			field[i][1] = 1;
		}*/
		
		/**
		 * HÌð·_ðÇÝñÅA
		 * constructionðfor[vÌâ~ðÉp¢A
		 * HÌð·_ð«ÞB
		 */
		construction = sc.nextInt();
		for(int i = 0; i < construction; i++){
			int x, y;
			x = sc.nextInt(); y = sc.nextInt();
			field[b-y+1][x] = -1;
		}
		
		//field[b][a] = 20;
		return true;
	}

	/**
	 * 		  _____       _____
	 * 		 |-1|-1| E E E |-1|-1|
	 * 		 |-1|0 | E E E |0 |-1|
	 * 		    @@E		@    @E
	 * 			E		@    @E
	 * 			E@@			E
	 * 		 |-1|0 | E E E |0 |-1|
	 * 		 |-1|-1| E E E |-1|-1|
	 * 		  -----       -----
	 **/
	static int slove(){
		for(int i = b; i >= 1; i--){
			for(int j = 1; j <= a; j++){
				if(field[b][1] == -1)
					return 0;
				
				if(field[i][j] == field[b][1]){
					field[i][j] = 1;
				}else if(field[i][j] == -1){
				
				}else if(field[i][j-1] == -1
						&& field[i+1][j] == -1){
					field[i][j] = 0;
				}else if(field[i][j-1] == -1){
					field[i][j] = field[i+1][j];
				}else if(field[i+1][j] == -1){
					field[i][j] = field[i][j-1];
				}else{
					/*
					 * ©ªªHÅàÈ­A
					 * ¶ÆºàHÅÈ©Á½çA
					 * field[i][j] = field[i][j-1] + field[i+1][j];
					 * ©ª@@¶@{@º
					 */
					field[i][j] = field[i+1][j]+field[i][j-1];
				}	
			}
		}		
		return field[1][a];
	}
}