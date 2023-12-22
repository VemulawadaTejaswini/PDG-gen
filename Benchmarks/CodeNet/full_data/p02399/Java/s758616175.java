
class Main {
    public static void main(String[] args){
    	// Scanner in = new Scanner(System.in);
		int a = 1000000000; //in.nextInt();
		int b = 1; //in.nextInt();

		int d = a / b;
		int r = a % b;
		float f = (float)a / (float)b;

    	System.out.printf("%d %d %f", d, r, f);
    }
}