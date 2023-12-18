import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String input = sc.next();
		int N = sc.nextInt();
      int M = sc.nextInt();
      Long list[] = new Long[N];
      int count = 0;
      Long output = new Long(0);
      while(sc.hasNext()){
        list[count] = sc.nextLong();
        count++;
      }
      
      for(int i = 0; i < N; i++){
        Long tmp = list[i];
        for(int j = i; j < N; j++){
          if(i == 0){
            if(tmp % M == 0){
            	output++;
            }
            continue;
          }
          tmp += list[j];
          if(tmp % M == 0){
            output++;
          }
        }
      }
      System.out.println(output);
	}
}
