import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] ary = {1, 2, 3, 4, 5, 6};
        int sum = 1;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;
            for (int i = 0; i < n; i++) {
                rotate(sc.next(), ary);
                sum += ary[0];
            }
            
            System.out.println(sum);
            
            // ?????????
            sum = 1;
            ary[0] = 1;
            ary[1] = 2;
            ary[2] = 3;
            ary[3] = 4;
            ary[4] = 5;
            ary[5] = 6;
        }
        
    }
    
    public static void rotate(String inStr, int[] inAry) {
        int tmp;
        switch(inStr) {
            case "North":
                tmp = inAry[0];
                inAry[0] = inAry[1];
                inAry[1] = inAry[5];
                inAry[5] = inAry[4];
                inAry[4] = tmp;
                break;
            case "East":
                tmp = inAry[0];
                inAry[0] = inAry[3];
                inAry[3] = inAry[5];
                inAry[5] = inAry[2];
                inAry[2] = tmp;
                break;
            case "West":
                tmp = inAry[0];
                inAry[0] = inAry[2];
                inAry[2] = inAry[5];
                inAry[5] = inAry[3];
                inAry[3] = tmp;
                break;
            case "South":
                tmp = inAry[0];
                inAry[0] = inAry[4];
                inAry[4] = inAry[5];
                inAry[5] = inAry[1];
                inAry[1] = tmp;
                break;
            case "Right":
                tmp = inAry[1];
                inAry[1] = inAry[2];
                inAry[2] = inAry[4];
                inAry[4] = inAry[3];
                inAry[3] = tmp;
                break;
            case "Left":
                tmp = inAry[1];
                inAry[1] = inAry[3];
                inAry[3] = inAry[4];
                inAry[4] = inAry[2];
                inAry[2] = tmp;
                break;
            default:
                break;
        }
    }
}