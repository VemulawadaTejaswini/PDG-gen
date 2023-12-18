import java.util.*;

public class Main{
//public class abc166_d{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long X = scan.nextLong();
		long temp = 1;

		for(long i=2;i<=X;i++){
			if(X % i == 0){
				temp = i;
				break;
			}
		}
		for(long i=0; ; i++){
			long j = i -temp;
			double cal = Math.pow(i,4) +(Math.pow(i,3) * j ) + (Math.pow(i,2)*Math.pow(j,2)) + (i*Math.pow(j,3)) + Math.pow(j,4);
			if( (X/temp) == cal){
				System.out.println(i +" " +j);
				break;
			}

		}
	}

}