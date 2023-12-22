import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	long N = (long)Math.pow(10,18);
      	long[] num = new long[n];
      	long ans = 1;
      	boolean t = false;
		for(int i=0;i<n;i++){
			num[i] = sc.nextLong();
          	if( num[i] == 0 ){
              ans = 0;
              break;
            }
          	if( ans * num[i] > N ){
              t = true;
            }
          	ans *= num[i];
        }
      if(t && ans !=0){
        ans = -1;
      }
         System.out.println(ans); 
	}
}