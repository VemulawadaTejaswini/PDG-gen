import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] inList;
		
		inList = new double[4];
		for(int i=0;i<4;i++) inList[i] = in.nextDouble();
		
		System.out.println(Math.sqrt(
				Math.pow(inList[2] - inList[0], 2) +
				Math.pow(inList[3] - inList[1], 2)));
	}
}