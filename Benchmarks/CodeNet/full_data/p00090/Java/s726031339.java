import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			double[][] point = new double[n][2];
			for(int i = 0;i < n;i++){
				String[] str = scan.next().split(",");
				point[i][0] = Double.parseDouble(str[0]);
				point[i][1] = Double.parseDouble(str[1]);
			}
			int max = 0;
			int t = 0;
			for(int i = 0;i < n-1;i++){
				t = 0;
				for(int j = i+1;j < n;j++){
					if(calcDist(point[i][0],point[i][1],point[j][0],point[j][1])){
						t++;
					}
				}
				if(max < t){
					max = t;
				}
			}
			System.out.println(max+1);
		}
	}
	
	public static boolean calcDist(double x1,double y1,double x2,double y2){
		double t = 0;
		t = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return (t <= 2)?true:false;
	}
}