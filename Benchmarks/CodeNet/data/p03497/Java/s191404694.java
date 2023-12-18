import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int ans = 0;
    Map<Integer,Integer> a=new HashMap<Integer,Integer>();
    for(int i=0;i<N;i++){
      int num=sc.nextInt();
      int cnt=a.getOrDefault(num, 0);
      a.put(num, cnt+1);
    }
    List<int[]> list=new ArrayList<int[]>();
    for(int i:a.keySet()){
      list.add(new int[]{i,a.get(i)});
    }
    Collections.sort(list,new Comparator<Integer>());
    for(int i=0;i<list.size()-K;i++){
      ans += list.get(i)[1];
    }
    System.out.println(ans);
  }
}