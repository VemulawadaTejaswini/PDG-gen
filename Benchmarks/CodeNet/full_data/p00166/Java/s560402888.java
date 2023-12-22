import java.util.Scanner;

//Area of Polygon
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			double sa = 0;
			while(--n!=0)sa += Math.sin(sc.nextDouble()*Math.PI/180);
			n = sc.nextInt();
			double sb = 0;
			while(--n!=0)sb += Math.sin(sc.nextDouble()*Math.PI/180);
//			System.out.println("SA:" + sa + " SB:" + sb);
			if(Math.abs(sa-sb)<1e-8)System.out.println(0);
			else System.out.println(sb<sa?1:sa<sb?2:0);
		}
	}
}