
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A, B, H, M;

		A = sc.nextInt();
		B = sc.nextInt();
		H = sc.nextInt();
		M = sc.nextInt();

		double thetaA = 30 * H +  0.5 * M;
		double thetaB = 6 * M;

		double xA,yA,xB,yB;

		xA=A*(Math.sin(Math.toRadians(thetaA)));
		yA=A*(Math.cos(Math.toRadians(thetaA)));
		xB=B*(Math.sin(Math.toRadians(thetaB)));
		yB=B*(Math.cos(Math.toRadians(thetaB)));


		double di=(xA-xB)*(xA-xB)+(yA-yB)*(yA-yB);
		double dist=Math.sqrt(di);
		System.out.println(dist);
	}
}
