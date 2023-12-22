import java.util.*;
public class Main {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
      
      	int maisu = 0;
      	if(n%1000=0) {
          maisu = n / 1000;
          System.out.println(maisu);
        } else {
          maisu = n % 1000 + 1;
          System.out.println(maisu);
        }
    }
}