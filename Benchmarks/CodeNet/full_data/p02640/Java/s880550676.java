import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int X = sc.nextInt();
      int Y = sc.nextInt();
      String ans = "No";
      if(X < 51){
        for(int i = 0; i <= X; i++){
          int j = X - i;
            int leg = 2 * i + 4 * j;
            if(leg == Y) ans = "Yes";
        }
      }
      System.out.println(ans);
    } 
}