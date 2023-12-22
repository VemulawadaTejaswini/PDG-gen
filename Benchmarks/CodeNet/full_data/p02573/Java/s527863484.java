import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    ArrayList<HashSet<Integer>> a = new ArrayList<HashSet<Integer>>();
    boolean[] b = new boolean[n];

    for (int i=0;i<n;i++){
      HashSet<Integer> f = new HashSet<Integer>();
      a.add(f);
      b[i] = false;
    }

    for (int i=0;i<m;i++){
      int b1 = scan.nextInt();
      int c = scan.nextInt();
      HashSet<Integer> a1 = a.get(b1-1);
      a1.add(c);
      HashSet<Integer> a2 = a.get(c-1);
      a2.add(b1);
    }

    ArrayList<String> q = new ArrayList<String>();
    int max = 0;

    for (int i=0;i<n;i++){
      if (b[i] == false){
        int sum = 1;
        HashSet<Integer> check = a.get(i);
        b[i] = true;
        for (int kk : check){
          if (b[kk-1] == false){
              b[kk-1] = true;
              q.add(kk+"");
          }
        }

        while (q.size() > 0){
          sum += 1;
          int aa = Integer.parseInt(q.get(0));
          q.remove(0);
          HashSet<Integer> check1 = a.get(aa-1);
          for (int kkk : check1){
            if (b[kkk-1] == false){
                b[kkk-1] = true;
                q.add(kkk+"");
            }
          }
        }
        max = Math.max(max,sum);
      }
    }
    System.out.println(max);
  }
}
