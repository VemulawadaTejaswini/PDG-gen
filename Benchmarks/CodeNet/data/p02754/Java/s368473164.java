import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    String str = "";
    
    for(;str.length() < N;){
      for(int i = 0;str.length() < N && i < A;i++){
        str = str + 'b';
      }
      for(int i = 0;str.length() < N && i < B;i++){
        str = str + 'r';
      }
    }
    int answer = 0;
    for(int i = 0;i < str.length();i++){
      if(str.charAt(i) == 'b')answer++;
    }
    System.out.println(answer);
  }
}