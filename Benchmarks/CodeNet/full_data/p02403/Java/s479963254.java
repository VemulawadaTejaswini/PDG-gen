import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		while(h != 0 || w != 0){
			for(int i = 0; i < h; i++){

				for(int j = 0; j < w; j++){
					sb.append("#");
				}
				sb.append("/n");

			}
			System.out.print(sb);

			h = sc.nextInt();
			w = sc.nextInt();
		}
	}
}