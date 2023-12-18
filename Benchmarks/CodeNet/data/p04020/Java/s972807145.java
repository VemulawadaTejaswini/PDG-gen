import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0;i < n;i++)a[i]=sc.nextInt();
      Deque<Integer> que = new ArrayDeque<>();
      for(int i = n-1;i >= 0;i--){
        for(int j = 0;j < a[i];j++){
          que.push(i+1);
        }
      }
      int cnt = 0;
      while(que.size()>=2){
        int b = que.pop();
        int c = que.pop();
        if(c==b+1||c==b){
          cnt++;
        }else{
          que.push(c);
        }
      }
      System.out.println(cnt);
    }
}