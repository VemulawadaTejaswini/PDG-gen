import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    boolean judge = false;
    for(int i=1;i<=9;i++){
      for(int j=i;j<=9;j++){
        if(i*j==N){
          System.out.println("Yes");
          judge = true;
          break;
        }
      }
    } 
    if(!judge){
      System.out.println("No");
    }
  }
}