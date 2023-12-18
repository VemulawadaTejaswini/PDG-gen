import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    int n=sc.nextInt();
    int m=sc.nextInt();
    Map<Integer,List<Integer>> mp=new HashMap<>();
    
    for(int i=0;i<n;i++){
      int day=sc.nextInt();
      if(!mp.containsKey(day)){
        mp.put(day,new ArrayList<Integer>());
      }
      mp.get(day).add(sc.nextInt());
//      System.out.print(day+":");
    }
    long sum=0;
    PriorityQueue<Integer> pq=new PriorityQueue<Integer>(
      new Comparator<Integer>(){
        public int compare(Integer o1,Integer o2){
          return Integer.compare(o2,o1);
        }
      }
    );
//    System.out.println("\npq.isEmpty()="+pq.isEmpty());
    for(int i=1;i<=m;i++){
//      System.out.println("i="+i);
      if(mp.containsKey(i)){
//        System.out.println("  contains");
        pq.addAll(mp.get(i));
      }
//      System.out.println("  "+pq.toString());
      if(!pq.isEmpty()){
        sum=sum+pq.poll();
//        System.out.println("  sum="+sum);
      }
    }
    System.out.println(sum);
  }
}