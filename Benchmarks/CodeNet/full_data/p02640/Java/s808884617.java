import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      if(!(y%2==0)){
        System.out.println("No");
        return;
      }
      int a=0;
      for(int i=0;i<=x;i++){
      	a=y-(i*4);
        if(a==(x-i)*2){
        	System.out.println("Yes");
          return;
        }
      }
      System.out.println("No");
      return;
	}
}