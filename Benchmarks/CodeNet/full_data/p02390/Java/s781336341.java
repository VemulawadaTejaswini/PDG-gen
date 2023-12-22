public class Main {
    public static void main(String[] args){
        int S = new java.util.Scanner(System.in).nextInt();
        int h = S / 3600;
        int m = (S - 3600 * h) / 60;
        int s = S - 3600 * h - 60 * m;

        System.out.println(s + ":" + m + ":" + s);
    }
}