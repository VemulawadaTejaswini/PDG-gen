import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    for (int i=b;i<=b+a;i++){
      if (i>c){
        break;
      }
      if (i % a == 0){
        System.out.println("OK");
        System.exit(0);
      }
    }
    System.out.println("NG");
  }
}
        
