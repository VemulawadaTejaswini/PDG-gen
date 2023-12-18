import java.util.*;

public class Main {
	
  	public static void main(String args[]) {
    
      	Scanner sc = new Scanner(System.in);
      	String input = sc.nextLine();
      	int count = Integer.valueOf(input);
      	double[] values = new double[count];
      
      	for( int i = 0 ; i<count ; i++) {
        	String input2 = sc.nextLine();
          	values[i] = Double.valueOf(input2);
        }
 		double ans = lcm(values,count);
      System.out.printf("%.0f",ans);
    }

	private static double lcm(double[] values,int length) {
		double ans = values[0]*values[1]/gcd(values[0],values[1]);
      	for( int i = 2 ; i<length ; i++ )
        {
          ans = ans*values[i]/gcd(ans,values[i]);
        }
      return ans;
	}
  
  private static double gcd(double a, double b){
     if(b==0)
       	return a;
    return gcd(b,a%b);
  }
                         
}