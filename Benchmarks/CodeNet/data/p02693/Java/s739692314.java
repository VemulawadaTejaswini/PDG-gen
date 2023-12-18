    import java.util.*;
     
    public class Main{
          public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int k = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                for(; a <= b+1; a++){
                  if(a % k == 0){
                    System.out.println("OK");
                    break;
                  } else if(a == b){
                    System.out.println("NG");
                    break;
                  }
                }
              }
    }