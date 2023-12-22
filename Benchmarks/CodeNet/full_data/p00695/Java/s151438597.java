import java.util.Scanner;

public class Main {

	static int[][] field;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while(N--!=0){
			field = new int[5][5];
			for(int i = 0;i<5;i++)
				for(int j = 0;j<5;j++)
					field[i][j]=cin.nextInt();
			int max=0;
			for(int x = 0;x<5;x++){
				for(int y = 0;y<5;y++){
					for(int i = 0;i+x<5;i++){
						for(int j = 0;j+y<5;j++){
							boolean f = true;
							for(int k = 0;k<=x;k++){
								for(int h = 0;h<=y;h++){
									if(field[i+k][j+h]==0){
										f=false;
									}
								}
							}
							if(f){
								max=Math.max((x+1)*(1+y),max);
							}
						}
					}
				}
			}
			System.out.println(max);
		}
	}

}