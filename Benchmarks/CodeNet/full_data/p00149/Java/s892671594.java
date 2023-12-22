import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double s[] = new double[2];
		int d[][] = new int[2][4];

		while(sc.hasNext()){
			s[0]=sc.nextDouble();
			s[1]=sc.nextDouble();
			
			for(int i=0;i<2;i++){
				if(s[i]<0.2)
					d[i][3]++;
				else if(s[i]<0.6)
					d[i][2]++;
				else if(s[i]<1.1)
					d[i][1]++;
				else
					d[i][0]++;
			}
		}
		for(int i=0;i<4;i++)
			System.out.println(d[0][i]+" "+d[1][i]);
	}
}