import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int counter = 0;
		int max = sc.nextInt();
		double[] a = new double[max];
		double b = 0;
      
		for(int i=0;i < max;i++){
			a[i]=sc.nextDouble();
		}

		for(int i=0;i < (max-1);i++){
			for(int j=(i+1);j < max;j++){
              	b = (a[i]*a[j]);
				if((b%1) == 0){
					counter += 1;
				}
			}
		}

		System.out.println(counter);
	}
}