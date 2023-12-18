import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);
		double number =sc.nextDouble();
		double[] translimit =new double[5];
		for(int i=0;i<5;i++){
			translimit[i]=sc.nextDouble();
		}

		int bottleneck = 0;
		for(int i=1;i<5;i++){
			if(translimit[bottleneck]>translimit[i]){
				bottleneck =i;
			}
		}

		int ans =(int)Math.ceil(number/translimit[bottleneck])+4;
		System.out.println(ans);
	}
}