import java.util.Scanner;

public class Main {
    public int Solution(int n){
        if (n>=400 && n<600)
            return 8;
        if (n>=600 && n<800)
            return 7;
        if (n>=800 && n<1000)
            return 6;
        if (n>=1000 && n<1200)
            return 5;
        if (n>=1200 && n<1400)
            return 4;
        if (n>=1400 && n<1600)
            return 3;
        if (n>=1600 && n<1800)
            return 2;
        if (n>=1800 && n<2000)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        Main obj=new Main();
        while (true){
            int n=tan.nextInt();
            System.out.println(obj.Solution(n));
        }
    }
}
