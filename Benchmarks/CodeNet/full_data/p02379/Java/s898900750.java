public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while(true){
			double x1 = scan.nextDouble();
			double x2 = scan.nextDouble();
			double y1 = scan.nextDouble();
			double y2 = scan.nextDouble();
			double ans = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			System.out.println(ans);
		}
	}

}