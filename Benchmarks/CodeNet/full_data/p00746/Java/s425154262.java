

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			int pre,angle;
			int xmax=0,ymax=0,xmin=0,ymin=0;
			
			int n = sc.nextInt();
			if(n==0) {break;}
			int[][] pos = new int[n][2];
			pos[0][0] = 0;  //x
			pos[0][1] = 0;  //y
			
			for(int i=1; i<n; i++) {
				pre = sc.nextInt();
				angle = sc.nextInt();
				
				switch(angle) {
				case 0: //left
					pos[i][0] = pos[pre][0]-1;
					pos[i][1] = pos[pre][1];
					if(pos[i][0] < xmin) {
						xmin = pos[i][0];
					}
					break;

				case 1: //down
					pos[i][0] = pos[pre][0];
					pos[i][1] = pos[pre][1]-1;
					if(pos[i][1] < ymin) {
						ymin = pos[i][1];
					}
					break;
					
				case 2: //right
					pos[i][0] = pos[pre][0]+1;
					pos[i][1] = pos[pre][1];
					if(pos[i][0] > xmax) {
						xmax = pos[i][0];
					}
					break;
					
				case 3: //up
					pos[i][0] = pos[pre][0];
					pos[i][1] = pos[pre][1]+1;
					if(pos[i][1] > ymax) {
						ymax = pos[i][1];
					}
					break;
				} //end switch
			} //end for
			System.out.print(xmax - xmin + 1);
			System.out.print(" ");
			System.out.println(ymax - ymin + 1);
			
		}

	sc.close();
	}

}

