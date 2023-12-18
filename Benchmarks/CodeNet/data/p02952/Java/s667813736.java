import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int output = 0;
      for(int i = 1; i <= N; i++){
        String tmp = String.valueOf(i);
        if(tmp.length() % 2 == 1){
          output++;
        }
      }
      System.out.println(output);
	}
}