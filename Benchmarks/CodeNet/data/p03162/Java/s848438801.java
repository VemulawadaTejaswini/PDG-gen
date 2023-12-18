import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        int[][] hap = new int[size][3];

        for (int i = 0 ; i < size ; i++) {
            String[] s = scan.nextLine().split(" ");
            hap[i][0] = Integer.parseInt(s[0]);
            hap[i][1] = Integer.parseInt(s[1]);
            hap[i][2] = Integer.parseInt(s[2]);
        }

        scan.close();

        for (int i = 1 ; i < size ; i++) {
            hap[i][0] = Math.max(hap[i-1][1],hap[i-1][2]);
            hap[i][1] = Math.max(hap[i-1][0],hap[i-1][2]);
            hap[i][2] = Math.max(hap[i-1][0],hap[i-1][1]);
        }

        System.out.print(Math.max(hap[size-1][0],Math.max(hap[size-1][1], hap[size-1][2])));
    }
}