import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int m = scn.nextInt();
		int[] a = new int[m*2];
		for(int i=0; i<a.length; i++){
			a[i] = scn.nextInt();
		}
      	for(int i=1; i<=n; i++){
          int count = 0;
          for(int j=0; j<=a.length; j++){
            if(i==a[j]) count++;
          }
          System.out.println(count);
        }
	}
}