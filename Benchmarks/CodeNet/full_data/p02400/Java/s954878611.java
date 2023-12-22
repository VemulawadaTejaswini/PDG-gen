import java.util.Scanner;

class Main{
  public static void main(String[] arg){
  	int r;
  	double pi, menseki, ensyu;
  	Scanner in = new Scanner(System.in);
  	r = in.nextInt();
  	pi = Math.PI;
  	menseki = r*r*pi;
  	ensyu = r*2*pi;
  	System.out.println(menseki + " " + ensyu);
	}
}