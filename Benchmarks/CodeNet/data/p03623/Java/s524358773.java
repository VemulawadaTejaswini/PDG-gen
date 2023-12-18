import java.util.*;
public class Main {
  	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
      	int house = sc.nextInt();
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      if(a - house > b - house){
        System.out.println("B");
      } else {
        System.out.println("A");
      }	
    }
}