    import java.util.*;
    public class Main{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    	int h = sc.nextInt();
        int w = sc.nextInt();
        int s = h * w;
        if(s % 2 == 1){
          s -= 1;
        }
        System.out.println(s);
      
      }
    }