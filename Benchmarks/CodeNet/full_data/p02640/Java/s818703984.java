import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
      int X = scan.nextInt();
      int Y = scan.nextInt();
      int Y2 = 0;
      Boolean ans = false;
      
      for(int i=0; i<X; i++){
        if(Y == 0)
          ans = true;
		Y2 = Y;
        Y -= 4;
		Y2 = Y2 - ((X-i)*2);
        if(Y == 0 || Y2 == 0)
          ans = true;
      }
      if(ans == true)
        System.out.println("Yes");
      else
        System.out.println("No");
   }
}