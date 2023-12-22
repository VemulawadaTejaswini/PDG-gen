import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		double[][] p = new double[4][2];
		while(stdIn.hasNext()){
			for(int i=0;i<4;i++){
				for(int j=0;j<2;j++){
					p[i][j]=stdIn.nextDouble();
				}
			}
			double AB_x_inc = p[1][0]-p[0][0];
			double AB_y_inc = p[1][1]-p[0][1];
			double m1 = AB_y_inc/AB_x_inc;
			double CD_x_inc = p[3][0]-p[2][0];
			double CD_y_inc = p[3][1]-p[2][1];
			double m2 = CD_y_inc/CD_x_inc;
			
			int res = (int) (m1*m2);
			if(res==-1){
				System.out.println("YES");
			}
			else if(res==0){
				if(AB_x_inc==0&&AB_x_inc==CD_y_inc){
					System.out.println("YES");
				}
				else if(CD_x_inc==0&&CD_x_inc==AB_y_inc){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
			else{
				System.out.println("NO");
			}
		}
	}
}