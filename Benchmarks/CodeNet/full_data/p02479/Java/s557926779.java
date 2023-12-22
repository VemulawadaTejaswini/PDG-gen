import java.util.*;
class Main{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int r = s.nextInt();
	double menseki,nagasa;
	double PI=Math.PI;
	menseki=r*r*PI;
	nagasa=2*PI*r;
	System.out.printf("%.6f %.6f",menseki,nagasa);
	}
}