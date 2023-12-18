import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    char b[] = new b[a];
    int counter;
    for(int i = 0;i < b.length;i++){
     b[i] = sc.nextChar();
    }
    for(int j = 0;j < b.length;j++){
      if(b[j-1]==b[j] && j != 0){
        counter++;
      }
    }
        System.out.println(a-couter);
  }
}