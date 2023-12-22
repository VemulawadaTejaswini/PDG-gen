import java.util.Scanner;
public class Main {
  
  public static final double max = Math.pow(10,18);
  
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	int count = Integer.parseInt(sc.next());
      	double result = 1;
        for (int i=0;i<count; i::) {
          double next = Double.parseDouble(sc.next());
          result = result * next;
          if (result > max) {
            System.out.println("-1");
            return;            
          }
        }
        System.out.println(String.valueOf(result));
    }
}