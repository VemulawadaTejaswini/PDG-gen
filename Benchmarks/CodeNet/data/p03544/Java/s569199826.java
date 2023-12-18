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
      int N = sc.nextInt();
      Long output = new Long(0);
      Long[] list = new Long[90];
      list[0] = new Long(2);
      list[1] = new Long(1);
      if(N == 1){
        myout(list[1]);
        return;
      }
      for(int i = 2; i <= N; i++){
        list[i] = list[i - 1] + list[i - 2];
      }
      myout(list[N]);
	}
}
