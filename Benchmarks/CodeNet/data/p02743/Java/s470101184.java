import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if((Math.sqrt(x) +Math.sqrt(y))<Math.sqrt(z)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}