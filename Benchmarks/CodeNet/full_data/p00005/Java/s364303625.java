import java.util.Scanner;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int num1 = scan.nextInt(), num2 = scan.nextInt();
			if(num1 < num2){
				int sub = num1;
				num1 = num2;
				num2 = sub;
			}
			int div = euclid(num1, num2);
			System.out.println(div + " " + num1 / div * num2);
		}
	}
	static int euclid(int num1, int num2){
		if(num1 % num2 == 0) return num2;
		return euclid(num2, num1 % num2);
	}
}