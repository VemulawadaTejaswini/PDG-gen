import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int h,m,s;

        h = num/(60*60);
        num -= h*60*60;

        m = num/(60);

        s = num%60;

        System.out.println(h + ":" + m + ":" + s);

    }
}

