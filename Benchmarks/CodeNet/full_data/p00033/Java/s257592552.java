import java.util.Scanner;

public class Main {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        // 0000000000(0) -> 1111111111(1023)
        int cases = SC.nextInt();
        int[] balls = new int[10];
        while (cases-- > 0) {
            for (int i = 0; i < 10; i++) {
                balls[i] = SC.nextInt();
            }
            int methods = 1024;
            boolean can = true;
            while (methods-- > 0) {
                can = true;
                char[] bitArray = Integer.toBinaryString(1024| methods).substring(1).toCharArray();
                int left = 0;
                int right = 0;

                for (int i = 0; i < 10; i++) {
                    // putin left
                    if (bitArray[i] == '0') {
                        // can put
                        if(balls[i]>left){
                            left = balls[i];
                        }
                        else{
                            can = false;
                            break;
                        }
                    }
                    // putin right
                    else{
                        if(balls[i]>right){
                            right = balls[i];
                        }
                        else{
                            can = false;
                            break;
                        }
                    }
                }
                if (can){
                    break;
                }

            }
            if (can){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }

    }
}

