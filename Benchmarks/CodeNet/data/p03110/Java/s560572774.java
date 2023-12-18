import java.util.*;

public class Main{
	public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
      
    int N = scn.nextInt();
	double[] x = new double[N];
    String[] u = new String[N];
    double btc_rate=380000.0;
    double sum = 0;
      
    for(int i=0;i<N;i++){
    x[i]=scn.nextDouble();
    u[i]=scn.next();
     // System.out.print("i,"+i+","+u[i]);
    
    if(u[i].equals("BTC")){
    sum+=(x[i]*btc_rate);
    }else{
    sum+=x[i];
    }
    }
      System.out.print(sum);
    }
}
    