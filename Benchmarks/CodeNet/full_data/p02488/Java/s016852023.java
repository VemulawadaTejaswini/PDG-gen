import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n;
    String str, tmp;
    n = input.nextInt();
    str = input.next();
    for (int i = 0; i < n - 1; i++){
      tmp = input.next();
      if (str.compareTo(tmp) > 0){
        str = tmp;
      }
    }
    System.out.println(str);
  }
}