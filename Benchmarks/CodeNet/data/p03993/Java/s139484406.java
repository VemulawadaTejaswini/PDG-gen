import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0;i < n;i++)a[i]=sc.nextInt();
      int cnt = 0;
      boolean friend = new boolean[n];
      Arrays.fill(friend,true);
      int cnt = 0;
      for(int i = 0;i < n;i++){
      	if(a[a[i]]==i&&a[i]==true&&a[a[i]]==true){
        	cnt++;
            a[i]=false;
            a[a[i]]=false;
        }
      }
      System.out.println(cnt);
    }
}