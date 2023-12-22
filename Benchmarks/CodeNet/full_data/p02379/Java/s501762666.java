import java.util.Scanner;
public class Math {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int x1=scan.nextInt();
		int y1=scan.nextInt();
		int x2=scan.nextInt();
		int y2=scan.nextInt();
		double d=Math.pow((x1-x2),2)+Math.pow((y1-y2),2);
		System.out.printf("%.8f\n",Math.sqrt(d));
		scan.close();
	}
}