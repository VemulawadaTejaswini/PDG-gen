import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

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
    		int n = sc.nextInt();
    		int array[] = new int [n*2];
    		for(int i = 0;i < n*2;i++){
    			array[i] = sc.nextInt();
    		}
    		Arrays.sort(array);
    		int sum = 0;
    		for(int i = 0;i < n*2;i += 2){
    			sum = sum + array[i];
    		}
    		System.out.println(sum);
    	}
    }
}