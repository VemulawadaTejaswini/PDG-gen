
import java.util.Scanner;

class MyMain{
    Scanner scanner;
    public MyMain(){
        scanner = new Scanner(System.in);
    }
    int getInt(){
        return Integer.parseInt(scanner.next());
    }
    public void main() {
        int s = getInt();
        int h = s / 3600;
        s %= 3600;
        int m = s / 60;
        s %= 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}

public class Main {

    public static void main(String[] args) {
        MyMain mymain = new MyMain();
        mymain.main();
    }
}

