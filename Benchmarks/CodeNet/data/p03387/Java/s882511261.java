import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i[] = new int[3];
        i[0] = sc.nextInt();
        i[1] = sc.nextInt();
        i[2] = sc.nextInt();
        Arrays.sort(i);
        int k = i[2] - i[1];
        i[1] += k;
        i[0] += k;
        System.out.println(i[0] + ":" + i[1] + ":" + i[2]);
        int j = (i[1] - i[0]) % 2 == 0 ? (i[1] - i[0]) / 2 : (i[1] - i[0] + 3) / 2;
        System.out.println(k + j);
    }
}