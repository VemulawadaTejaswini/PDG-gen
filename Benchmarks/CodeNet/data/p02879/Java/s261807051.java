    import java.util.Scanner;
            public class Main{
              public static void main(String[] args){
                Scanner stdIn = new Scanner(System.in);
                int a = stdIn.nextInt();
                int b = stdIn.nextInt();
                int c = a*b;
                if((a<1)||(a>9)||(b<1)||(b>9)){
                  System.out.println("-1");
                }else{
                  System.out.println(c);
                }
              }
            }