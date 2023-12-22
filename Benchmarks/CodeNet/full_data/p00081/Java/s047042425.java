import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String[] str = scan.nextLine().split(",");
			double[] point = new double[str.length];
			for(int i = 0;i < str.length;i++){
				point[i] = Double.parseDouble(str[i]);
			}
			if(point[0] == point[2]){
				System.out.printf("%.5f %.5f\n",2.0*point[0]-point[4],point[5]);
				continue;
			}
			double a = (point[3]-point[1]) / (point[2]-point[0]);
			double b = ((point[1]*point[2]) - (point[0]*point[3])) / (point[2]-point[0]);
			if(a == 0){
				System.out.printf("%.5f %.5f\n",point[4],2.0*b-point[5]);
				continue;
			}
			double c = 1 + a*a;
			double x = (1.0 - a*a)*point[4] - 2*a*b + 2*a*point[5];
			double y = (a*a - 1.0)*point[5] + 2*a*point[4] + 2*b;
			System.out.printf("%.5f %.5f\n",x/c,y/c);
		}
	}
	
}