import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        new Main().run();
    }


    private int count;
    private byte[] s;
    private void run() {
        count = 0;
        Scanner scanner = new Scanner(System.in);
        s = scanner.next().getBytes();
//        a 65 b 66 c 67
        if(s.length < 3) {
            System.out.println("0");
            return;
        }
        for(int i = 0; i < s.length - 2; i++){
            i += checkStr(i);
        }
        System.out.println(count);

    }

    private int checkStr(int i) {
        if(i < 0 || i > s.length -3 ) {
            return 0;
        }
        if(s[i] == 65 && s[i+1] == 66 && s[i+2] == 67) {
            count ++;
            s[i] = 66;
            s[i+1] = 67;
            s[i+2] = 65;
            checkStr(i-1);
            return 1;
        }
        if(s[i+2] == 65) {
            return 1;
        }
        return 0;
    }
}