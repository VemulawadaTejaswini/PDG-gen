import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] c = new int[n];
      int[] s = new int[n];
      int[] f = new int[n];
      for(int i = 1;i < n;i++){
      	c[i]=sc.nextInt();
        s[i]=sc.nextInt();
        f[i]=sc.nextInt();
      }
      int[] sum = new int[n+1];
      for(int i = 1;i < n;i++){
        for(int j = i;j < n;j++){
          int l = s[j];
          if(sum[i]>l){
          	while(sum[i]>l)l+=f[j];
          }
          sum[i]=l;
          sum[i]+=c[j];
        }
        System.out.println(sum[i]);
      }
      System.out.println(0);
    }
}