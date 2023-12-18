import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String colorNumber = "Three";
    for(int i = 0; i<N; i++){
      String str = sc.next();
      if(str.equals("Y")){
        colorNumber = "Four";
        break;
      }
    }
  System.out.println(colorNumber);
  }
}
