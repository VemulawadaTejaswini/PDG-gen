import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
      	int num = Integer.parseInt(line);
        int count = 0;
        Double result;
      	if(num == 1) {
          result = 1.0;
          System.out.println(result);
        } else {
          for(int i=1; i <= num; i++) {
            if(i % 2 != 0) {
              count++;
            }
          }
          result = (double)count / (double)num;
          System.out.println(result);
        }
    }
}