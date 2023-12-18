import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] xarr = new int[n];
        int[] yarr = new int[n];
        int[] harr = new int[n];

        for(int i = 0;i < n;i++){
            xarr[i] = sc.nextInt();
            yarr[i] = sc.nextInt();
            harr[i] = sc.nextInt();
        }

        int[][] charr = new int [101][101];
        for(int x = 0;x <= 100;x++){
            for(int y = 0;y <= 100;y++){
                charr[x][y] = harr[0] + Math.abs(xarr[0] - x) + Math.abs(yarr[0] - y);
            }
        }

        for(int i = 1;i < n;i++){
            for(int x = 0;x <= 100;x++){
                for(int y = 0;y <= 100;y++){
                    if(charr[x][y]  == -1){
                        continue;
                    } else {
                        int th = harr[i]+ Math.abs(xarr[i] - x) + Math.abs(yarr[i] - y);
                        if(th != charr[x][y]){
                            charr[x][y] = -1;
                        }
                    }
                }
            }
        }

        for(int x = 0;x <= 100;x++) {
            for (int y = 0; y <= 100; y++) {
                if(charr[x][y] != -1){
                    System.out.println(x + " " + y + " " + charr[x][y]);
                }
            }
        }
    }
}
