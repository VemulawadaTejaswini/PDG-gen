import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
    	new A().doIt();
    }
    class A{
    	void doIt(){
    		int a[] = new int[3];
    		for(int i = 0;i < 3;i++){
    			a[i] = sc.nextInt();
    		}
    		Arrays.sort(a);
    		if(a[0] == 5 && a[1] == 5 && a[2] == 7){
    			System.out.println("YES");
    		}else{
    			System.out.println("NO");
    		}
    	}
    }
}