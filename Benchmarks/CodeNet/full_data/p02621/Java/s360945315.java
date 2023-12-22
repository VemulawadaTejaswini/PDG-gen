import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        
        var n = scaner.nextInt();

        System.out.println((int)(n+Math.pow(n, 2)+Math.pow(n, 3)));

        scaner.close();
    }

}
