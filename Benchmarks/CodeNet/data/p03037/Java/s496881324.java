import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    PriorityQueue<Integer[]> queue = new PriorityQueue<Integer[]>((a,b)->{
        return a[0]!=b[0]?a[0]-b[0]:a[1]-b[1];
    });
    int l = 0,r = 0;
    for(int i=0;i<M;i++){
      l = sc.nextInt();
      r = sc.nextInt();
      queue.add(new Integer[]{l,0});
      queue.add(new Integer[]{r,1});
    }
    int ans = 0;
    int tmp = 0;
    int pre = 0;
    while(!queue.isEmpty()){
        Integer[] tp = queue.poll();
        if(tp[1] == 0){
          tmp++;
          pre=tp[0];
        }else{
          if(tmp==M){
            ans += tp[0]-pre+1;
          }
          tmp--;
        }
    }
    System.out.println(ans);
  }
}
