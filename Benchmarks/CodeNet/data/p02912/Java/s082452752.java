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
      Long output = new Long(0);
      int N = sc.nextInt();
      int M = sc.nextInt();
      //int[] list = new int[N];
      ArrayList<Integer> list = new ArrayList<Integer>(N);
      int i;
      for(i = 0; i < N; i++){
        list.add(sc.nextInt());
      }
      for(i = 0; i < M; i++){
        int max = Collections.max(list);
        if(max == 0){
          myout(0);
          return;
        }
        list.set(list.indexOf(max),max / 2);
      }
      for(i = 0; i < N; i++){
        output += list.get(i);
      }
      myout(output);
	}
}
