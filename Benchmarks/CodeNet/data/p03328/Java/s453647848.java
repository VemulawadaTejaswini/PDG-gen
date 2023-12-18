import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
      int b = sc.nextInt();
      int t=0;
      for(int i=1;i<=b-a-1;i++){
        t+=i;
      }
        System.out.println(t-a);    
    }
}