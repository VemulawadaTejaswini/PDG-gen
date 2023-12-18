import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        if(n * a <= n * b){
            System.out.println(n * a);
        }else{
            System.out.println(n * b);
        }
    }
    
}