import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int odd = 0;
        for(int i = 1; i <= n; i++){
            int x = in.nextInt();
            if(x % 2 == 1) odd++;
        }

        if(odd % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}