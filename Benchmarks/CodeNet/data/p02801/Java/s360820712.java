import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String moji = scanner.next();
        if(moji.equals("z")){
            System.out.println("a");
        }else{
            System.out.println((char)( moji.charAt(0)+ 1));
        }
    }
}
