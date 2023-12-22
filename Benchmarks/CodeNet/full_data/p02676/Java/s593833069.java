    import java.util.Scanner;
     
    public class Main {
      public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        String S = scan.next();
        
        if(S.length()>K){
          try {
                System.out.println(S.substring(0, K));
            } catch(NullPointerException e) {
                System.out.println();
            } catch(Throwable e) {
                System.out.println();
            }
        }else{
          System.out.println(S);
        }
      }
    }