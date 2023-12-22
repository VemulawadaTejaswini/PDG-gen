import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double x1=sc.nextDouble();
			double y1=sc.nextDouble();
			double x2=sc.nextDouble();
			double y2=sc.nextDouble();
			double x3=sc.nextDouble();
			double y3=sc.nextDouble();
			double xp=sc.nextDouble();
			double yp=sc.nextDouble();
			if((x3*(y1-y2)+y3*(x2-x1)+x1*y2-x2*y1)*(xp*(y1-y2)+yp*(x2-x1)+y1*y2-x2*y1)<0){
				System.out.println("NO");
			}else if((x1*(y2-y3)+y1*(x3-x2)+x2*y3-x3*y2)*(xp*(y2-y3)+yp*(x3-x2)+x2*y3-x3*y2)<0){
				System.out.println("NO");
			}else if((x2*(y3-y1)+y2*(x1-x3)+x3*y1-x1*y3)*(xp*(y3-y1)+yp*(x1-x3)+x3*y1-x1*y3)<0){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
		}
	}
}