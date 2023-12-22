import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double a = scan.nextDouble();
			double sum = a;
			double tmp = a;
			for(int i=2;i<11;i++){
				if(i%2 == 0){
					tmp *= 2;
				}else{
					tmp /= 3;
				}
				sum += tmp;
			}
			System.out.printf("%.8f\n",sum);
		}
	}
}