import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		int rowLength = 1;
		for(int i = 1; ; i++){
			double num = Math.pow(2, i)*x;
			if(num <= y){
				rowLength++;
			}else{
				break;
			}
		}
		System.out.println(rowLength);
	}
}