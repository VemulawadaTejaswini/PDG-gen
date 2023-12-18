import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      //文節の長さ
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      
      
      if(a >= 5 && b >= 5 && c >= 5){
        int total = a + b + c;
        if((a >= 7 || b >= 7 || c >= 7) && total == 17){
          System.out.println("YES");
        }else{
          System.out.println("NO");
        }
      }else{
        System.out.println("NO");
      }
      
      

	}
}
