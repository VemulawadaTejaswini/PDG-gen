import java.util.*;

public class Main{
  public static void main(String[] args){
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    Scanner sc = new Scanner(System.in);
    String[] s = sc.nextLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int m = Integer.parseInt(s[1]);
    int sum = 0 ;
     //制限日数

    List<Integer> a = new ArrayList<Integer>();   //仕事にかかる時間(要素n)
    List<Integer> b = new ArrayList<Integer>();   //報酬(要素n)
    int aa;
    int bb;
    for(int i=0; i<n; i++){
      aa = sc.nextInt();
      bb = sc.nextInt();
      a.add(aa);
      b.add(bb);
    }
    //System.out.println("仕事にかかる時間:"+a);
    //System.out.println("      報酬:      "+b);
    for(int j=1; j<=m; j++){         //jは日数
      for(int k=0; k<a.size(); k++){
        if(a.get(k)<=j&&a.get(k)!=0){
          pq.add(b.get(k));
          a.remove(k);
          b.remove(k);
          a.add(k,0);
          b.add(k,0);
          //System.out.println(pq);
        }
      }
      try{
        sum += pq.poll();
      }
      catch(NullPointerException e){         //優先度付きキューのnull回避

      }
    }
    System.out.println(sum);
  }
}