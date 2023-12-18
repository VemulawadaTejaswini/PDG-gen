import java.util.Scanner;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    	int line = sc.nextInt();
    	int line2 = sc.nextInt();
      
      int x = 1;
      int y = 1;
      while(line != line2){
        if(line < line2 ){
          line = line * x;
          x = x + 1;
        }else if(line2 < line ){
          line2 = line2 * y;
          y = y + 1;
        }
      }
      System.out.print(line);
    }
}