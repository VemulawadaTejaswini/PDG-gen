import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] cnt = new int[200001];
      int INF = 10000000;
      int x = 0;
      int ans = 0;
      for(int i = 0;i < 200001;i++)cnt[i]=INF;
      for(int i = 0;i < n;i++){
        int r = sc.nextInt();
        if(cnt[r]==INF)cnt[r]=1;
        else if(cnt[r]!=INF)cnt[r]++;
      }
      Arrays.sort(cnt);
      for(int i = 0;i < 200001;i++){
      	if(cnt[i]==INF){
          x = i;
          break;
        }
      }
      int j = 0;
      while(x>k){
      	ans+=cnt[j];
        x--;
        j++;
      }
      System.out.println(ans);
    }
}