    import java.util.Scanner;
     
     
    public class Main {
        public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if ((b-a)/k>=1){
                System.out.println("Ok");
            } else if(a==b&&k==1){
          System.out.println("Ok");
     
            }else{
                System.out.println("No");
            }
        }
    }