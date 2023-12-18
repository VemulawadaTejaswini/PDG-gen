import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int k = scn.nextInt();
      	int count = 1;
      	while(n>=k){
        	n/=k;
          	count++;
        }
      	System.out.println(count);
	}
}