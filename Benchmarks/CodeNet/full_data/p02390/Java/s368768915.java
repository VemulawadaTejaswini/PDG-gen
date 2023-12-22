import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int time=scanner.nextInt();
        int h,m,s;
        s=time%60;
        time/=60;
        m=time%60;
        h=time/60;
        System.out.println(h+":"+m+":"+s);
    }
}

