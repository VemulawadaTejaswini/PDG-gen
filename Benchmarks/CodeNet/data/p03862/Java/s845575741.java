import java.util.Scanner;

/**
 * @Author oreid
 * @Release 04/12/2016
 */
public class MainA3 {
    static long[] row;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x =  scanner.nextInt();
        int opertations = 0;

        row = new long[n];

        for (int i = 0; i < n ; i++) {
            row[i] = scanner.nextInt();
        }

        scanner.close();

            for (int i = 1; i < n; i++) {
                    while(row[i -1] + row[i] > x){
                        if(row[i -1] > row[i]){
                            row[i-1] -= 1;

                        }else{
                            row[i] -= 1;
                        }
                        opertations++;
                    }
            }


        System.out.print(opertations + "");
    }
}
