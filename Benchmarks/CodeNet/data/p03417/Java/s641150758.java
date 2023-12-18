import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();

        int cnt = 0;

        int i = 0;
        if(n != 1 && m!= 1) i = (n * 2) + ((m - 2) * 2);
        else i = 2;
        cnt = n * m - i;

        System.out.println(cnt);

        scan.close();
    
    }

}