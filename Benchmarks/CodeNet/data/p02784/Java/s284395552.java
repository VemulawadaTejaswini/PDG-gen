import java.util.*;

class Main{
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();
    int n = scan.nextInt();

    int s = scan.nextInt();  
    int t = 0;
    
    for (int i = 0; i <= n; i++){ 
      t += s;
    }
      
		if(h <= t){
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
  }
}