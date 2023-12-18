import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int l = sc.nextInt();
		int[] a = new int[n+1];
      	a[0] = 0;
		for(int i=1; i<=n; i++){
			a[i] = l + i -1;
		}
      	int sum = 0;
      	for(int i=1; i<=n; i++){
          sum += a[i];
        }
      	int low = Math.abs(a[1]);
      	int num = 0;
      	int eat = 0;
      	for(int i=1; i<=n; i++){
          num = Math.abs(a[i]);
          if(low>=num){
            low = num;
            eat = a[i];
          }
        }
      	System.out.println(sum-eat);
	}
}
