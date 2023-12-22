
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner stdin = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(stdin.next());
            int y = Integer.parseInt(stdin.next());
            if(x==0&&y==0) break;
            if(x<=y) System.out.println(x+" "+y);
            else System.out.println(y+" "+x);
        }
        stdin.close();
    }
}