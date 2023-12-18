import java.util.Scanner;
public class Main{
  public static void main(String args[]){
   Scanner sc = new scanner(System.in);
    int a = sc.nextInt();
    int b[] = new int[a-1];
    int c = 0;
    for(int i = 0;i < b.length;i++){
      b[i] = sc.nextInt();
      if(i > 0){
      c += b[i-1]*b[i];  
      }
    }
    System.out.println(c);
  }
}
