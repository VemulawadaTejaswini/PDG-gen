import java.util.Scanner;
class Main{
	public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
      int A = sr.nextInt();
      double B = sr.nextDouble();
      double C = (double)A*B;
      double total = 2.8;
      double max = 10.0;
      int i =  (int) (total / max * 100);
      System.out.println(i);

    }
}