import java.util.Scanner;
import java.util.Set;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Set<Long> set = new HashSet<Long>();
    boolean hantei = true;
    
    for(int i=0; i<N; i++){
      int bSize = set.size();
      Long A = sc.nextLong();
      size.add(A);
      if(set.size == bSize)
        boolean = false;
        break;
    }
    if(hantei == true) System.out.println("YES");
    else System.out.println("NO");
  }
}
