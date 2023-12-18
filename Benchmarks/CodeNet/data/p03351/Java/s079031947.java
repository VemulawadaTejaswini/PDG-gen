import java.util.*;

public class Main {
	public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	int a = scn.nextInt();
      int b = scn.nextInt();
      int c = scn.nextInt();
      int d = scn.nextInt();
      int x = Math.abs(b-a);
      int y = Math.abs(c-b);
      int z = Math.abs(c-a);
      int check = 0;
      if(z<=d){
        check = 1;
      }
      if(x<=d && y<=d){
        check = 1;
      }
      if(check=1){
        System.out.println("Yes");
      }
      if(check=0){
        System.out.println("No");
      }
	}
}