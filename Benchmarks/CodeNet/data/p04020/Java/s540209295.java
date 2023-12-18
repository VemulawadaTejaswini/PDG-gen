import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      int sum = 0;
      int ans = 0;
      for(int i = 0;i < n;i++)a[i]=sc.nextInt();
      for(int i = 0;i < n;i++){
        if(a[i]!=0)sum+=a[i];
        else{
          ans += sum/2;
          sum = 0;
        }
      }
      ans+=sum/2;
      System.out.println(ans);
    }
}