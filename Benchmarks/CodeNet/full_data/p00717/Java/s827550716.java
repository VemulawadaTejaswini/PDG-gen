import java.util.Scanner;

public class Main{
	public static class Cordinate{ int x, y; }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int data = sc.nextInt();
			if(data==0) break;
			int[] polygonal = new int[data+1];
			Cordinate[][] apexes = new Cordinate[data+1][10]; 
			for(int i=0; i<=data; i++){
				polygonal[i] = sc.nextInt();
				for(int j=0; j<polygonal[i]; j++){
					apexes[i][j] = new Cordinate();
					apexes[i][j].x = sc.nextInt();
					apexes[i][j].y = sc.nextInt();
				}
			}

			for(int i=1; i<=data; i++){
				if(polygonal[0] != polygonal[i]) continue;

				boolean tf;

				for(int k=0; k<4; k++){
					for(int j=0; j<polygonal[0]; j++){
						int temp = apexes[0][j].x;
						apexes[0][j].x = apexes[0][j].y;
						apexes[0][j].y = temp * -1;
					}

					tf = true;
					int x1 = apexes[0][0].x, y1 = apexes[0][0].y;
					int x2 = apexes[i][0].x, y2 = apexes[i][0].y;

					for (int j=0; j<polygonal[0]; j++) {
						if(apexes[0][j].x - x1 != apexes[i][j].x - x2){
							tf = false;
							break; 
						}
						if(apexes[0][j].y - y1 != apexes[i][j].y - y2){
							tf = false;
							break; 
						}
					}
					if(tf){
						System.out.println(i);
						break; 
					}

					tf = true;
					x1 = apexes[0][polygonal[0]-1].x;
					y1 = apexes[0][polygonal[0]-1].y;

					for (int j=0; j<polygonal[0]; j++) {
						if(apexes[0][polygonal[0]-1-j].x - x1 != apexes[i][j].x - x2){
							tf = false;
							break; 
						}
						if(apexes[0][polygonal[0]-1-j].y - y1 != apexes[i][j].y - y2){
							tf = false;
							break; 
						}
					}
					if(tf){
						System.out.println(i);
						break; 
					}
				}
			}

			System.out.println("+++++");
		}
	}
}