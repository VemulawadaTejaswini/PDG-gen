import java.util.*;
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
 
 
	public void run() {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		if(A==1||B==1){
		    if(A<B){
		        System.out.println("Alice");
		    }else if(A==B){
		        System.out.println("Draw");
		    }else{
		        System.out.println("Bob");
		    }
		}else{
		    if(A<B){
		        System.out.println("Bob");
		    }else if(A==B){
		        System.out.println("Draw");
		    }else{
		        System.out.println("Alice");
		    }
		}
		
		
		sc.close();
	}
		
}
