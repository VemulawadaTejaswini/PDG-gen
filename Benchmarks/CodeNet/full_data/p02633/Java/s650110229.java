import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	
    int x = Integer.parseInt(sc.next());

    boolean t = true;
    int k = 0;
      
    if (t){
      k =360/x;
    } else {
      k =(int)360/x + 1;
    }
    
	System.out.println(k);
    }
 
}
