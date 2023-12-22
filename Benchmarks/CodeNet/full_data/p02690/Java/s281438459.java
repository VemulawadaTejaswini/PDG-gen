import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        // 200^5 - 199^5 = 7920399001 > 10^9 であることから、200まで全探索すればOKっしょ、と考えてたら甘かったが、よくわからん🙉
        for(long a=-200; a<=200; a++) {
            for(long b=-200; b<=200; b++) {
                long a5 = a*a*a*a*a;
                long b5 = b*b*b*b*b;
                if(x==a5-b5) {
                    System.out.print(a);
                    System.out.print(" ");
                    System.out.println(b);
                    return;
                }
            }
        }
        throw new RuntimeException("could not find");
    }
}
