import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class Main {

    public static void main (String[] args) {
        
        int num = Integer.parseInt(args[0]);
      	double number = (double)num;
      	int count = 0;
      	while(num >= 100) {
          number /= 1.01;
          count++;
        }
      	
      	System.out.println(count);
    }
}