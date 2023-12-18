import java.util.Scanner;

class A_Sum_of_Two_Integers {
public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cnt = 0;
        int i = 1;
        while (true) {
            if (i>(n - i) )
                break;
            cnt++;
            i++;
        }
        System.out.printf("%d",cnt);
    }
}