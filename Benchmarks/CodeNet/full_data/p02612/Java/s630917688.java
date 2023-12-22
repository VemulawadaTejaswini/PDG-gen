import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int pay = N;
		
		while(!(pay%1000==0)){
			pay++;
		}
		System.out.println(pay-N);
    }
}
