import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    String blue = "";
    String red = "";
    String str = "";
    for(int i = 0;i < A;i++){
      blue = blue + "b";
    }
    for(int i = 0;i < B;i++){
      red = red + "r";
    }
    for(;str.length() < N;){
      str = str + blue + red;
    }
    int answer = 0;
    for(int i = 0;i < str.length() - 1;i++){
      if(str.charAt(i) == 'b')answer++;
    }
    System.out.println(answer);
  }
}