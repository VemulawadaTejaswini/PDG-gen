import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[6];
        for (int i = 0; i < num.length; i ++)
            num[i] = input.nextInt();
        String op = input.next();
        char[] opr = op.toCharArray();
        for (int j = 0; j < opr.length; j ++)
            operation(opr[j], num);
        System.out.println(num[0]);
    }
    
    public static void operation(char o, int[] n){
        int temp = 0;
        switch (o) {
            case 'N' :
                temp = n[0];
                n[0] = n[1];
                n[1] = n[5];
                n[5] = n[4];
                n[4] = temp;
                break;
            case 'S' :
                temp = n[0];
                n[0] = n[4];
                n[4] = n[5];
                n[5] = n[1];
                n[1] = temp;
                break;
            case 'W' :
                temp = n[0];
                n[0] = n[2];
                n[2] = n[5];
                n[5] = n[3];
                n[3] = temp;
                break;
            case 'E' :
                temp = n[0];
                n[0] = n[3];
                n[3] = n[5];
                n[5] = n[2];
                n[2] = temp;
                break;
            default :
                break;
        }
    }
}
