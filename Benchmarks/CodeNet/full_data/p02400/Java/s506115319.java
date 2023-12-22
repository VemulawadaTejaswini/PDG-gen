import java.util.Scanner;

class Main{
  public static void main(String[] arg){
  	int r;
  	double menseki, ensyu;
  	Scanner in = new Scanner(System.in);
  	r = in.nextInt();
  	menseki = r*r*Math.PI;
  	ensyu = r*2*Math.PI;
  	System.out.println(menseki + " " + ensyu);
	}
}