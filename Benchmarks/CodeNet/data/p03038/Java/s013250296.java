import java.util.*;
public class Main {
	public static void myout(Object text){//standard output
		System.out.println(text);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
      int N = sc.nextInt();
      int M = sc.nextInt();
      Long output = new Long(0);
      for(int i = 0; i < N; i++){
        pq.add(sc.nextInt());
      }
      
      int[][] bc = new int[M][2];
      for(int i = 0; i < M; i++){
        bc[i][0] = sc.nextInt();
        bc[i][1] = sc.nextInt();
      }
      Arrays.sort(bc,Comparator.comparingInt(o -> o[1]));
      
      for(int i = 0; i < M; i++){
        int b = bc[i][0];
        int c = bc[i][1];
          for(int j = 0; j < b; j++){
            if(pq.peek() < c){
              pq.poll();
              pq.add(c);
            }else{
              break;
            }
          }
      }
      
      Iterator it = pq.iterator();
      //myout(it);
      while(it.hasNext()){
        int tmp = (Integer)it.next();
        //myout(tmp);
        output = output + tmp;
      }
      myout(output);
	}
}

