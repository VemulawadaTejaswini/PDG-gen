import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt();
        int res = (X/500)*1000 + ((X - (X/500)*500)/5)*5;
        System.out.println(res);

    }
}