import java.util.*;
class Main {
  public static void main(String args[]){
    new Main().run();
  }

  Scanner sc = new Scanner(System.in);
  void run(){
    while(true){
      int n = sc.nextInt();
      int m = sc.nextInt();
      if((n|m) == 0)return;
      final int ds[]=new int[n];
      final int ps[]=new int[n];
      Integer ns[]=new Integer[n];
      for(int i = 0 ;i < n;i++){
        ds[i] = sc.nextInt();
        ps[i] = sc.nextInt();
        ns[i] = i;
      }
      Arrays.sort(ns, new Comparator<Integer>(){
        public int compare(Integer i, Integer j){
          return ds[j] * ps[j] - ps[i] * ds[i];
        }
      });
//      System.err.println(Arrays.toString(ns));
      int ans = 0;
      for(int i = 0 ; i < n ; i++){
        ans += ps[ns[i]] * (ds[ns[i]] - Math.min(ds[ns[i]], m));
        m   -= Math.min(ds[ns[i]], m);
      }
      System.out.println(ans);
    }
  }
}