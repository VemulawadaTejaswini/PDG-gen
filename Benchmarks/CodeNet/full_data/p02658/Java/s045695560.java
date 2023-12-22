import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();
                long seki = 1;

                try{

                for (int i = 0; i < N; i++) {
                	seki *= scan.nextInt();
                	Math.incrementExact(seki);
                }
                
                if (seki <= Math.pow(10, 18)) {
                	System.out.println(seki);
                } else {
                	System.out.println(-1);
                }


                }
                catch (Exception e){
                    System.out.println(-1);
                }
        }

}