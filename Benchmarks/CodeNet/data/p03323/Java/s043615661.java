import java.util.*;

class Main {
	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	String ans = "";
      
      	if (a <= 8 && b <= 8) {
          ans = "Yay!";
        } else {
          ans = ":(";
        }
      	
      System.out.println(ans);
    } 
}