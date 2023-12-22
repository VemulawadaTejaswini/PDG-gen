import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new TEST().doIt();
    }
    class TEST{
        void doIt(){
        	int n = sc.nextInt();
        	for(int i = 1;i <= n;i++){
        		if(i % 3 == 0)System.out.print(" "+i);
        		else if(i % 10 == 3)System.out.print(" "+i);
        	}
        	System.out.println();
        }
    }
}