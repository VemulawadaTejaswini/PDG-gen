
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = 0; 
      
      for(int i=0;i<4;i++){
        if(charAt(i)=='o'){
          b++;
        }
      }
            System.out.println(700+b*100);
    }
}