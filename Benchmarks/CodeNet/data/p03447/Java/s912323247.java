import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        x = x - a; 
        for(;;){
          if(x-b<0) break;
          x = x-b;
          
        }
        System.out.print(x);
        
}
}
