import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] cards = new int[4][13];
		int pos = 0;
		for(int z = 0; z < n; z++){
			String a = sc.next();
			int x = sc.nextInt();
			if(a.equals("S")){
				pos = 0;
			}else if(a.equals("H")){
				pos = 1;
			}else if(a.equals("C")){
				pos = 2;
			}else if(a.equals("D")){
				pos = 3;
			}
			cards[pos][x]=1;
		}
		for(int i = 0; i < 4; i++){
			for(int j = 1; j < 14; j++){
				if(cards[i][j] != 1){
					if(i == 0){
						System.out.println("S "+j);
					}else if(i==1){
						System.out.println("H "+j);
					}else if(i==2){
						System.out.println("C "+j);
					}else if(i==3){
						System.out.println("D "+j);
					}
				}
			}
		}
	}
}