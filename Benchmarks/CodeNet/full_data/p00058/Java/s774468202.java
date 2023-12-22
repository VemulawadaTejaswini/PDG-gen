import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static double xA, yA, xB, yB, xC, yC, xD, yD; 
	static double a1, a2;
	static final double EPS = 0.00001;
	public static void main(String[] args) {
		while(read()){
			slove();
		}
	}
	static boolean read(){
		if(!sc.hasNextDouble())return false;
		
		xA = sc.nextDouble();
		yA = sc.nextDouble();
		xB = sc.nextDouble();
		yB = sc.nextDouble();
		xC = sc.nextDouble();
		yC = sc.nextDouble();
		xD = sc.nextDouble();
		yD = sc.nextDouble();
		return true;
	}
	static void slove(){
		//System.out.println(xA + "," + yA);
	if((xB - xA == 0 && yB - yA == 0) || (xD - xC == 0 && yD -yC == 0)){	
		System.out.println("NO");
		}else if(xB - xA == 0 && yD -yC == 0){
			System.out.println("YES");
		}else if(yB - yA == 0 && xD - xC == 0){
			System.out.println("YES");
		}else if(((yB - yA) / (xB - xA))== -1 || ((yD - yC) / (xD - xC)) == -1){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}