import java.util.*;
public class Main {
    public static void main(String[] ano) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	int d =scan.nextInt();
        	int sum =0;
        	for(int i=1;i<=(600/d-1);i++){
        		sum += d*Math.pow(i*d,2);
        	}
        	System.out.println(sum);
        }
    }
}