import java.util.Random;
class Elementary{
       public static void main(String[] args){
                Random stdIn = new Random();
                
                int m = stdIn.nextInt(100) + 1;
                int n = stdIn.nextInt(1000000000) + 1;
                double x;
                x = Math.pow(m,n);
                double y = x % 1000000007;
                System.out.println(y);
       }
}