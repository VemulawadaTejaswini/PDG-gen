import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int leg = 0;
        int count = X;
        boolean flag = false;

        if(Y == X*2 || Y == X*4){
            System.out.println("Yes");
        } else {
            for(int i = 1;i <= X;i++) {
                leg = (count - i) * 2;
                leg += (count - (count - i))*4;
                if (leg == Y) {
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        }
    }