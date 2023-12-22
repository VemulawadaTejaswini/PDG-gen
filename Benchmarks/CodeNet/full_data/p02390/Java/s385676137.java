import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int h = num / 3600;
        num -= h*3600;
        int m = num / 60;
        num -= m*60;
        System.out.println(h+":"+m+":"+num);

    }
}
