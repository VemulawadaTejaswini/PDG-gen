import java.util.Scanner;

public class Main {

    public static int main(){
        Scanner s = new Scanner(System.in);

        int a = Integer.parseInt(s.next());
        int b = Integer.parseInt(s.next());
        int t = Integer.parseInt(s.next());
        s.close();

        System.out.println((t/a)*b);

        return 0;
    }

}
