import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    int x;
    while(true){
      n = sc.nextInt();
      x = sc.nextInt();
      int count = 0;
      if(n == 0 && x == 0){
        break;
      }
      for(int i = 1; i <= n; i++){
        for(int j = i+1;j <= n; j++){
         for(int k = j + 1; k <= n; k++) {
        	 if(x == i+j+k) {
        		 count++;
        	 }
         }
        }
      }
      System.out.println(count);
    }
  }
}

