import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int turu = a*2;
      int kame = a*4;
      if(b%2==0){
      if(b <= kame&&b>=turu){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
      }
      else{
        System.out.println("No");
      }
      
      
		
	
}
}