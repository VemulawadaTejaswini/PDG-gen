import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      char[] c = sc.next().toCharArray();
      int[] w = new int[n+2];
      int[] e = new int[n+2];
      int cnt = 0;
      for(int i = 1;i <= n;i++){
      	if(c[i-1]=='W')w[i]++;
        if(c[i-1]=='E')e[i]++;
        w[i]+=w[i-1];
        e[i]+=e[i-1];
      }
      int min = Math.min(w[n],e[n]);
      if((c[0]=='E'&&w[n]==n-1)||(c[n-1]=='W'&&e[n]==n-1))min = 0;
      for(int i = 1;i < n-2;i++){
        int x = e[n]-e[i+2];
        int y = w[i];
      	min = Math.min(min,x+y);
      }
      System.out.println(min);
    }
}
