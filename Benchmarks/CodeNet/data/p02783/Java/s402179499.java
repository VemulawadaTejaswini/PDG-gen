import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int h = Integer.parseInt(sc.next());
      	int a = Integer.parseInt(sc.next());
      	int count = 0;
      	while(h > 0){
        	h = h-a;
          	count++;
        }
      	System.out.println(count);
    }
}