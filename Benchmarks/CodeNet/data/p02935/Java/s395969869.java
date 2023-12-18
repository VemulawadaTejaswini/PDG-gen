import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	double[] v = new double[n];
      	for (int i = 0; i < n; i ++){
         	v[i] = scan.nextDouble(); 
        }
      	Arrays.sort(v);
      	for(int j = 0; j < n-1; j++){
        	v[j + 1] = (v[j] + v[j + 1]) / 2;
        }
      	System.out.print(v[n-1]);
    }
}