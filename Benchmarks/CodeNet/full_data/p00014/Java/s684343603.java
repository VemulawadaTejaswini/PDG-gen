import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()){
			int d = scan.nextInt();
			int sum = 0;
			
			for(int i=d;i<600-d;i+=d){
				sum = sum+(i*i*d);
			}
			sum = sum+((600-d)*(600-d)*d);
			System.out.println(sum);
		}
	}
}