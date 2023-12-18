import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();

        if(a == b){
          if(a != c) System.out.println("Yes");
          else System.out.println("No");
          return;
        } if(b == c){
          if(b != a) System.out.println("Yes");
          else System.out.println("No");
          return;
        } if(c == a){
          if(c != b) System.out.println("Yes");
          else System.out.println("No");
          return;
        }else{
          System.out.println("No");
          return;
        }

    }
}

