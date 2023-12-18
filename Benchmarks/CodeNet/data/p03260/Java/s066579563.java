import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt()*scan.nextInt();
    scan.close();
    System.out.println(n%2==1?"Yes":"No");
    return;
  }
}