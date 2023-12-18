import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      char[] c = sc.next().toCharArray();
      int n = c.length;
      int cnt = 1;
      Queue<Integer> q = new ArrayDeque<>();
      for(int i = 1;i < n;i++){
      	if(c[i]==c[i-1])cnt++;
        else{
          q.add(cnt);
          cnt = 1;
        }
      }
      q.add(cnt);
      while(q.size()!=0){
      	int a = q.poll();
        int b = q.poll();
        for(int i = 1;i <= a-1;i++)System.out.print(0+" ");
        System.out.print(b/2+(a+1)/2);
        System.out.print(" ");
        System.out.print((b+1)/2+a/2);
        if(b!=1||q.size()!=0)System.out.print(" ");
        for(int i = 1;i <= b-1;i++){
          if(q.size()==0&&i==b-1)System.out.print(0);
          else System.out.print(0+" ");
        }
      }
      System.out.println("");
    }
}