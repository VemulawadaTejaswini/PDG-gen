class Main {
	public static void main(String[] args){

	java.util.Scanner scanner = new java.util.Scanner(System.in);
	double r = scanner.nextDouble();
	double pi = Math.PI;
	float s = (float) (pi*r*r);
	float l =(float) (2*r*pi);
		System.out.println(s+" "+l);
		scanner.close();
	 }
}