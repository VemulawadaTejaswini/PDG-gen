import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int n = N;
    int fN = 0;
    
    while(n > 0){
      fN += n % 10; //1の位を取得
      n /= 10;  //1桁ずらす  	
    }
    if(N % fN == 0) System.out.println("Yes");
    else System.out.println("No");   
  }
}


