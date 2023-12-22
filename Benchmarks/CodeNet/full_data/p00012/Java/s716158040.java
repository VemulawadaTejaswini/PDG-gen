import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		coordinate[] crd=new coordinate[5];
		for(int i=0;i<5;i++){
			crd[i]=new coordinate();
		}
		while(sc.hasNextDouble()){
			crd[0].input(sc.nextDouble(),sc.nextDouble());
			crd[1].input(sc.nextDouble(),sc.nextDouble());
			crd[2].input(sc.nextDouble(),sc.nextDouble());
			crd[3].input((crd[0].x+crd[1].x+crd[2].x)/3,(crd[0].y+crd[1].y+crd[2].y)/3);
			crd[4].input(sc.nextDouble(),sc.nextDouble());
			
			if(intersection(crd[0],crd[1],crd[3],crd[4])&intersection(crd[1],crd[2],crd[4],crd[3])&&intersection(crd[2],crd[0],crd[4],crd[3])){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}

	}
	public static boolean intersection(coordinate p1,coordinate p2,coordinate p3,coordinate p4){
		boolean judge=((p1.y-p2.y)*(p3.x-p1.x)-(p1.x-p2.x)*(p3.y-p1.y))*((p1.y-p2.y)*(p4.x-p1.x)-(p1.x-p2.x)*(p4.y-p1.y))>0;
		return judge;
	}
	public static class coordinate{
		double x,y;
		coordinate(double x,double y){
			this.x=x;
			this.y=y;
		}
		coordinate(){
			this.x=0;
			this.y=0;
		}

		public void input(double x,double y){
			this.x=x;
			this.y=y;
		}
	}
}