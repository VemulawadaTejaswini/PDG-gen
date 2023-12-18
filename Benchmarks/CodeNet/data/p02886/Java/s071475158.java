import java.util.Scanner;
public class Main{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b[] = new int[a];
    int c = 0;
    for(int i = 0;i < b.length;i++){
      b[i] = sc.nextInt();
    }
    for(int x = 0;x < b.length;x++){
      for(int y = x+1;y < b.length;y++){
        c += b[x]*b[y];
      }
    }
    System.out.println(c);
  }
}