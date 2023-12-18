import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int k = scan.nextInt();
        int x = scan.nextInt();
        
        int yen = 500;
        for(int i=0;i<k; i++) {
            yen += 500;
        }
        if(yen <= x)
            System.out.println("Yes");
        else
            System.out.println("NO");
    }
}