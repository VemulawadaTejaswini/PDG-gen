import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double[] point = new double[8];
		while(scan.hasNext()){
			for(int i = 0;i < 8;i++){
				point[i] = scan.nextDouble();
			}
			if(s(point[0],point[1],point[2],point[3],point[6],point[7])+
					s(point[2],point[3],point[4],point[5],point[6],point[7])+
					s(point[0],point[1],point[4],point[5],point[6],point[7])-
					s(point[0],point[1],point[2],point[3],point[4],point[5]) < 0.0001){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
	public static double len(double x1,double y1,double x2,double y2){
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
	public static double s(double x1,double y1,double x2,double y2,double x3,double y3){
		double a = len(x1,y1,x2,y2);
		double b = len(x2,y2,x3,y3);
		double c = len(x3,y3,x1,y1);
		double s = (a + b + c)/2.0;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}