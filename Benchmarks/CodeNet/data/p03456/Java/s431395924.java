import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = Integer.parseInt(s);
      for(int j =1 ; j<1000 ; j++){
        if(i % j == j){
          System.out.println("Yes");
        	      return;
        }
      }

      System.out.println("No");
    }
}