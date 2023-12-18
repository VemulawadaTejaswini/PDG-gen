import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int num = Integer.parseInt(s.next());
      	double number = (double)num;
      	int count = 0;
      	while(number >= 100) {
          number /= 1.01;
          count++;
        }
      	
      	System.out.println(count);
    }
}