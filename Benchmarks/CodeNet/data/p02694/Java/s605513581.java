import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
          double number = Double.parseDouble(s.next());
          double base = 100;
      	int count = 0;
      	while(number >= base) {
          base *= 1.01;
          base = Math.floor(base);
          count++;
        }
      	
      	System.out.println(count);
    }
} 
