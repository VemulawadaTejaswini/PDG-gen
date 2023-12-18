import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    
    for(int i=1;i<=9;i++){
      for(int j=1;j<=9;j++){
        if(i*j==num){
          System.out.println("Yes");
          break;
        }
      }
    }
    
    System.out.println("No");
  }
}
