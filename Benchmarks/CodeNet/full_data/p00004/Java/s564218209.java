import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        	DecimalFormat df1 = new DecimalFormat("0.000");
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int c = sc.nextInt();
        	int d = sc.nextInt();
        	int e = sc.nextInt();
        	int f = sc.nextInt();
        	int x = (b*f-c*e)/(b*d-a*e);
        	int y = (c-a*x)/b;
        	System.out.println(df1.format(x)+" "+df1.format(y));
        }
    }
}