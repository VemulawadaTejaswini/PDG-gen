import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 3000;++i){
            int a = sc.nextInt(),b = sc.nextInt();
            if(a == 0 && b == 0) break;
            System.out.printf("%d %d\n",a < b ? a : b,a < b ? b : a);
        }
        sc.close();
    }

}