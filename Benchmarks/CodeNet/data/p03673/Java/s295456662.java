import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
     	List<Integer> b = new ArrayList<Integer>();
      int a;
      
      	for(int i = 0; i < n; i++){
          a = Integer.parseInt(scan.next());
          if(a % 2 == 0){
            b.add(a);
          }else{
            b.add(0, a);
          }
        }
      if(n % 2 != 0){
        for(int i = 0; i<n; i++){
          System.out.print(b.get(i));
          System.out.print(" ");
        }
      }else{
        for(int i = 0; i < n; i ++){
          System.out.print(b.get(n - i - 1));
          System.out.print(" ");
        }
      }
    }
}