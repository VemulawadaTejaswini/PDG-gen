        import java.util.Scanner;
        public class Main{
        public static void main(String[] args){
        	Scanner scan  = new Scanner(System.in);
          int k = scan.nextInt();
        	String s= scan.next();
          if(S.length()<=k){
        		System.out.println(s);
        }
          else if(S.length()>=k){
            System.out.println(S.length(k) +"...");
          }
        }
        }