import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      	int x = a % 10;
      	int y = a % 100 - x;
       	int z = a/100;
		if(x==7||y==7) {
          System.out.println("Yes");
          break;
        }
   	    else if(z==7) {
          System.out.println("Yes");
        }
   		else{
          System.out.println("No");
        }
	}
}