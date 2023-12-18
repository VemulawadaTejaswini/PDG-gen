import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int sum = 0;
      	int count = 0;
      	for(int i=1; i<=n; ++i){
			for(int j=1; j<=n; ++j){
				if(n%j==0){
					sum = sum + 1;
        		}
      		}
          	if(sum==8 && i%2==1){
              count = count + 1;
            }
          	sum = 0;
        }
      	system.out.println(count);
	}
}