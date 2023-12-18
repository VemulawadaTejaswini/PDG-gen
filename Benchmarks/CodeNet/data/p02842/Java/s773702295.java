import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double X = Math.round(N/1.08);

		if(N==Math.floor((int)X*1.08)){
			System.out.println((int)X);
		}else{
			System.out.println(":(");
		}
    }
}
