import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
    ArrayList<Integer> list = sosu(100000);
    int[] s = new int[100001];
    for(int i = 1;i<=100000;i++){
      if(list.contains(i)&&list.contains((i+1)/2))s[i]=s[i-1]+1;
      else s[i]=s[i-1];
    }
    for(int i = 0;i < q;i++){
      int l = sc.nextInt();
      int r = sc.nextInt();
      System.out.println(s[r]-s[l-1]);
    }
  }
  public static ArrayList<Integer> sosu(int n){
    boolean[] a = new boolean[n+1];
    Arrays.fill(a,true);
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 2;i <= n/2;i++){
      if(a[i]==true){
        for(int j = i*2;j <= n;j+=i)a[j]=false;
      }
    }
    for(int i = 2;i <= n;i++)if(a[i])list.add(i);
    return list;
  }
}