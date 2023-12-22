import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		int H,W;
		Scanner sc = new Scanner(System.in);
		while(true){
			H = sc.nextInt();
			W = sc.nextInt();
			if(H == 0 || W == 0){
				break;
			}
			char [][] array = new char[H][W];
			sc.nextLine();
			for(int i = 0; i < H; i++){
				String line = sc.nextLine();
				for(int j = 0; j < W; j++){
					array[i][j] = line.charAt(j);
				}
			}
			int i = 0;
			int j = 0;
			boolean flag = true;
			boolean visit[][] = new boolean[H][W];
			here:while(flag){
				if(visit[i][j]){
					System.out.println("LOOP");
					break here;
				}
				visit[i][j] = true;
				switch(array[i][j]){
				case '>':
					j++;
					break;
				case '<':
					j--;
					break;
				case '^':
					i--;
					break;
				case 'v':
					i++;
					break;
				case '.':
					System.out.println(j+" "+i);
					break here;
				}
			}
		}
	}
}