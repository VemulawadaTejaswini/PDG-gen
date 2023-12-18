import java.util.*;

public class  Main{
	public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
  	  int n = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());
      int q = Integer.parseInt(sc.next());
      int tmp;
      
      int p[] = new int[n];
      int re[] = new int[n];
      
      for(int i=0;i<n;i++) p[i] = 0;
      
      for(int i=0;i<q;i++){
        tmp = Integer.parseInt(sc.next());
        p[tmp-1]++;
      }
      for(int i=0;i<n;i++){
        re[i] = q-p[i];
      }
      for(int i=0;i<n;i++){
        if(re[i] < k) System.out.println("Yes");
        else System.out.println("No");
      }
	}
}