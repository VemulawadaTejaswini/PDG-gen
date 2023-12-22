public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while(true){
			double x1 = scan.nextInt();
			double x2 = scan.nextInt();
			double y1 = scan.nextInt();
			double y2 = scan.nextInt();
			double ans = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			System.out.println(ans);
		}
	}

}