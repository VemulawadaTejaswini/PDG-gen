public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int r = scan.nextInt();

		double p = 3.141592;
		double area = r*r*p;
		double circu = 2*r*p;
		System.out.printf("%f\n",area + " " + "%f\n",circu);
	}

}