import java.util.Scanner;

class test{
  public static void main(String args[]){
  	Scanner scanner = new Scanner(System.in);
  	int a = scanner.nextInt();
    String s = scanner.nextString();
    if(a<3200){
      System.out.print(s);
    }else{
      System.out.print("red");
    }
  }
}
