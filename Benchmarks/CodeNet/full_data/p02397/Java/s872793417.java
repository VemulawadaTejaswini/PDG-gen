import java.util.*;                                                                                  

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3000; i++) {
          String line = sc.nextLine();
          String[] l = line.split(" ");
          int x = Integer.parseInt(l[0]);
          int y = Integer.parseInt(l[1]);

          if(x == 0 && y == 0) {
            break;
          }   

          if(x <= y) {
            System.out.println(x + " " + y); 
          } else {
            System.out.println(y + " " + x); 
          }   
        }   
    }   
}