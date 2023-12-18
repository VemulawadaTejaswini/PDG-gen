    import java.util.Scanner;
    
    class Main {
     
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            sc.close();
            double power = 1;
            
            for (double i = 1; i <= N; i++) {
            	power *= i;
            	power %= (Math.pow(10, 9) + 7);
            }
            System.out.println(power);
        }
    }