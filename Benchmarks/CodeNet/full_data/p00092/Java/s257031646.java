import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		doIt();

	}
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n != 0){
			int[][] field = new int[n][n];
			boolean bEnd = true;
			for(int i = 0; i < n; i++){
				String s = sc.next();
				for(int j = 0; j < n; j++){
					if(s.charAt(j) == '.'){
						field[i][j] = 1;
						bEnd = false;
					}
				}
			}
			if(bEnd){
				System.out.println(0);
				n = sc.nextInt();
				continue;
			}
			int level = 1;
			while(true){
				bEnd = true;
				for(int i = 0; i < n - level; i++){
					//フィールドを見て、レベルを上げていく
					for(int j = 0; j < n - level; j++){
						if(field[i][j] == level){
							//次のレベルが作れるか？
							if(field[i][j + 1] == level 
									&& field[i + 1][j] == level 
									&& field[i + 1][j + 1] == level
							){
								field[i][j] = level + 1;
								bEnd = false;
							}
						}
					}
				}
				if(bEnd){
					break;
				}
				level++;
				//print(field);
			}
			System.out.println(level);
			n = sc.nextInt();
		}
	}
	
	public static void print(int[][] f){
		for(int[] a : f){
			for(int b : a){
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}

}