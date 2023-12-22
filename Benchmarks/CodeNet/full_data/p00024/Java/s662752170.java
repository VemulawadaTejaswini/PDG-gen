import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            System.out.println((int)Math.ceil(Math.pow(sc.nextDouble(), 2)/98+1));
            
        }
    }
}
