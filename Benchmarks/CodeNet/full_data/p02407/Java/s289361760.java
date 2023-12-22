import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        for (int x = 0; x < n; x++){
            a[x] = scan.nextInt();
        }
        int y = 0;
        for(int x = n -1; x > -1; x--){
            b[x] = a[y];
            y++;
        }
        for (int x = 0; x < n; x++){
            System.out.print(b[x] + " ");
        }


    }
}
