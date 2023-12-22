import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double dx,dy;
		
		for(int i = 0; i < n; i++){
			double[] d = new double[8];
			
			for(int j = 0; j < 8; j++)
				d[j] = sc.nextDouble();
				
			if(d[2] - d[0] == 0)dx = d[3] - d[1];
			else dx = (d[3] - d[1]) / (d[2] - d[0]);
			if(d[6] - d[4] == 0)dy = d[7] - d[5];
			else dy = (d[7] - d[5]) / (d[6] - d[4]);
			
			if(dx == dy)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}