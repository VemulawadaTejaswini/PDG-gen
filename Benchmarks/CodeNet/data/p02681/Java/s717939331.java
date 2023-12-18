import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String t = sc.nextLine();

            
            if(s.length()+1==t.length()){
              System.out.println("Yes");
            }
            else System.out.println("No");
          }
}
