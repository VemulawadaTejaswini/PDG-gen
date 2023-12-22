import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
      	boolean flg = true;
      	int year = 0;
      	long money = 100;
      	long counter = 0;
      
      	while (flg) {
          	money *= 1.01; 
          	counter += 1;
          	if (num<=money) {
              flg = false;
              System.out.println(counter);
            }	
        }

        
    }

}