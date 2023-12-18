import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
        double count = 0;
        int countInt = 0;
        count = (b-1) / (a-1);
        while(count > 0){
        	countInt++;
            count =  count - 1.0;
        }
      System.out.println(countInt);
	}
 
}