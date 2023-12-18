import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    if( N % 4 == 0 || N % 7 == 0){
    System.out.println("Yes");  
    } else{
    while(N > 0){
      N -= 7;
      if( N < 0) break;
    if(N % 4 == 0){
      System.out.println("Yes");
        break;
       }
    }
    if(N < 0)
      System.out.println("No");
    }
  }
}