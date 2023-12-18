import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int X = Integer.parseInt(sc.next());
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(X);
    for(int i=0;i<N;i++){
      list.add(Integer.parseInt(sc.next()));
    }
    list.sort((a,b)->a-b);
    int ans = 0;
    for(int i=0;i<list.size()-1;i++){
      if(ans == 0){
        ans = list.get(i+1)-list.get(i);
      }else{
        ans = gcd(ans,list.get(i+1)-list.get(i));
      }
    }
    System.out.println(ans);

  }
  static int gcd (int a, int b) {
  	int temp;
  	while((temp = a%b)!=0) {
  		a = b;
  		b = temp;
  	}
  	return b;
  }
}
