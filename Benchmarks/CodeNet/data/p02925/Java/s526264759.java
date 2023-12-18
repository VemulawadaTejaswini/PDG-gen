import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    int  n = Integer.parseInt(sc.next());
    Deque<Integer>[] dq = new Deque[n];
    for(int i=0;i<n;i++){
      dq[i]=new ArrayDeque<Integer>(n-1);
      for(int j=0;j<n-1;j++){
        dq[i].addLast(Integer.parseInt(sc.next())-1);
      }
    }
    int days=0;
    Set<Integer> match = new HashSet<>();
    while(true){
      for(int i=0;i<n;i++){
        if(!dq[i].isEmpty()&&!dq[dq[i].getFirst()].isEmpty()&&dq[dq[i].getFirst()].getFirst()==i){
          match.add(i);
        }
      }
      if(match.isEmpty()){
        for(int j=0;j<n;j++){
          if(!dq[j].isEmpty()){
            System.out.println(-1);
            return;
          }
        }
        System.out.println(days);
        return;
      }else{
        for(int j:match){
          dq[j].removeFirst();
        }
      }
      days++;
      match.clear();
    }
  }
}
