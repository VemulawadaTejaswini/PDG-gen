import java.util.Scanner;
import java.lang.Math;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
		int div = 2;
		int count = 0;
		
		while(a >= div){
			//int pow = 1;
			for(int pow =1;a% (Math.pow(div,pow)) == 0;pow++){
				a/=(Math.pow(div,pow));
				count++;
			}
            while(a%div==0){
              a/=div;
            }
			div++;
			}
      System.out.print(count);
    }
}