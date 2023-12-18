    import java.util.Scanner;
    
    class Main {
     
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            sc.close();
            double power = 1;
            int div = 0;
            
            for (double i = 1; i <= N; i++) {
            	power *= i;
            }
            div = (int) (power % (Math.pow(10, 9) + 7));
            System.out.println(div);
        }
    }