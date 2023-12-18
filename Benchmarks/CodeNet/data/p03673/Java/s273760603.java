import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
     	List<int> b = new ArrayList<int>();
      int a
      
      	for(int i = 0; i < n; i++){
          a = Integer.parseInt(scan.next());
          if(a % 2 == 0){
            list.add(a);
          }else{
            list.add(0, a);
          }
        }
      if(n % 2 == 0){
        for(int i = 0; i<n; i++){
          System.out.println(b.get(i));
        }
      }else{
        for(int i = 0; i < n; i ++){
          System.out.println(b.get(n - i - 1));
        }
      }
    }
}