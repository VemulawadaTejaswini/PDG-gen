import java.util.Scanner;


public class Main {
	Scanner sc;
	
	boolean solve(double[][] point){
		double[][] v=new double[3][2];
		for(int i=0;i<3;++i){
			for(int j=0;j<2;++j){
				v[i][j]=point[i][j]-point[3][j];
			}
		}
		double theta=0;
		for(int i=0;i<3;++i){
			double ip=(v[i][0]*v[(i+1)%3][0]+v[i][1]*v[(i+1)%3][1]);
			theta+=Math.acos(ip/Math.hypot(v[i][0],v[i][1])/Math.hypot(v[(i+1)%3][0],v[(i+1)%3][1]));
		}
		return theta>=Math.PI*2;
	}
	
	double nd(){
		return sc.nextDouble();
	}
	
	void io(){
		sc=new Scanner(System.in);
		double[][] point=new double[4][2];
		while(sc.hasNext()){
			for(int i=0;i<4;++i){
				for(int j=0;j<2;++j){
					point[i][j]=nd();
				}
			}
			System.out.println(solve(point)?"YES":"NO");
		}
	}
	
	public static void main(String[] args){
		new Main().io();
	}
}