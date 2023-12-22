import java.util.*;

public class Main{
    private static double calculation(double value){
	double sum = value;
	double[] values = new double[10];
	values[0] = value;
	
	for(int i = 1; i < 10; ++i){
	    if(i%2 == 1){
		values[i] = values[i-1]*2.0;
	    } else {
		values[i] = values[i-1]/3.0;
	    }
	    sum += values[i];
	}
	

	return sum;
    }
    
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	while(sc.hasNext()){
	    double value = sc.nextDouble();
	    System.out.printf("%f\n", calculation(value));
	}
    }
}