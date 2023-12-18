import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	List<Double> list = new ArrayList<>();
    	int n = sc.nextInt();
    	double sum = 0;
    	for(int i = 0; i < n; i++) {
    		double m = (double) sc.nextInt();
    		sum+=(1/m);
    	}
    	
    	System.out.println(1/sum);
    }
}