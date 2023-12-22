import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
        int maisu = calcMaisu(n);
         
      	System.out.println(maisu * 1000 - n);
    }

    private static int calcMaisu(int n) {
        int maisu = 0;
        do {
            maisu++;
        }while(n > maisu * 1000);
      	return maisu;
    }
  
}