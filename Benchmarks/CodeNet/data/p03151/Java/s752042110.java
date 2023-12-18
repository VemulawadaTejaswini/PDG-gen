import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      int[] b = new int[n];
      int[] c = new int[n];
      int sum = 0;
      int cnt = 0;
      ArrayList<Integer> list =new ArrayList<>();
      for(int i = 0;i < n;i++)a[i]=sc.nextInt();
      for(int i = 0;i < n;i++){
        b[i]=sc.nextInt();
        c[i]=a[i]-b[i];
        if(c[i]>0)list.add(c[i]);
        else if(c[i]==0){}
        else{
          sum+= (-1)*c[i];
          cnt++;
        }
      }
      Collections.sort(list,Collections.reverseOrder());
      int sb = list.size();
      while(sum>0&&list.size()>0){
      	int h = list.get(0);
        list.remove(0);
        if(h<=sum){
          sum-=h;
        }else{
          sum=0;
        }
      }
      int sa = list.size();
      if(sum>0)System.out.println(-1);
      else System.out.println(cnt+sb-sa);
    }
}
