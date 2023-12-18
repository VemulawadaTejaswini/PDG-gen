import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      char[] c = sc.next().toCharArray();
      int[] w = new int[n];
      int[] e = new int[n];
      int cnt = 0;
      if(c[0]=='W')w[0]=1;
      if(c[0]=='E')e[0]=1;
      for(int i = 1;i < n;i++){
        int k = 0;
      	if(c[i]=='W')k++;
        int t = 0;
        if(c[i]=='E')t++;
        w[i]=w[i-1]+k;
        e[i]=e[i-1]+t;
      }
      int min = Math.min(w[n-1]-w[0],e[n-2]);
      for(int i = 0;i < n-2;i++){
        int x = e[n-1]-e[i+2];
        int y = w[i];
      	min = Math.min(min,x+y);
      }
      System.out.println(min);
    }
}