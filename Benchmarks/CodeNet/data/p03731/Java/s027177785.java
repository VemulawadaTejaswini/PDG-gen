import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int ne = -1;
        long to = (long)t * n;
        for (int i = 0;i < n;++i){
            int a = scanner.nextInt();
            if(ne > 0&&ne - a > 0){
                to -= ne - a;
            }
            ne = a + t;
        }
        System.out.println(to);
    }

}

