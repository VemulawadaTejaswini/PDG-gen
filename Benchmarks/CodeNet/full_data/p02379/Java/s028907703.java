public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		double ans =Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		System.out.println(ans);

	}

}