import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		
		if(n%k==0)
          System.out.println(n%k);
      	else
          System.out.println((n+k)%k);
		
	}

}