import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner sc = new Scanner(System.in);
		 double[] A=new double[11];
		while(sc.hasNext()){
			double sum=0;
			double a=sc.nextDouble();
			A[1]=a;
			for(int i=2; i<=10; i++){
				if(i%2==0){
					A[i]=2*A[i-1];
				}else{
					A[i]=A[i-1]/3.0;
				}
				
				
			}
			System.out.println(add(A));
		}
	}
	public static double add(double[] A){
		double sum=0;
		for(int i=1; i<=10; i++){
			sum+=A[i];
		}
		return sum;
	}


















	}
