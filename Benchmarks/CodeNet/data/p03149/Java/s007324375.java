import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for(int i = 0; i < 4; i++){
            int b = sc.nextInt();
            if(b == 1) a[0] = 1;
            if(b == 4) a[1] = 1;
            if(b == 7) a[2] = 1;
            if(b == 9) a[3] = 1;
        }

        if(a[0] ==1 && a[1] ==1 && a[2] ==1 && a[3] ==1) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }

}
