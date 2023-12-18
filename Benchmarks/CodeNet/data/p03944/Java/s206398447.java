import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		sc.nextLine();
		int[][] t = new int[N][3];
		for (int i=0;i<N;i++){
			t[i][0] = sc.nextInt();
			t[i][1] = sc.nextInt();
			t[i][2] = sc.nextInt();
		}
		int xHead = 0;
		int xTail = W;
		int yHead = 0;
		int yTail = H;
		int area = 0;
		for (int i=0;i<N;i++){
			if (t[i][2]==1){
				if (t[i][0]>=xHead){
					xHead = t[i][0];
				}
			}
			else if (t[i][2]==2){
				if (t[i][0]<=xTail){
					xTail = t[i][0];
					
				}				
			}
			else if (t[i][2]==3){
				if (t[i][1]>=yHead){
					yHead = t[i][1];
				}				
			}
			else if (t[i][2]==4){
				if (t[i][1]<=yTail){
					yTail = t[i][1];
				}					
			}
		}
		area = (xTail-xHead)*(yTail-yHead);
		if (area<=0){
			area = 0;
		}
		System.out.println(area);
		
	}

}
