import static java.lang.System.out;

public class Main{
    public static void main(String[] args)
        int S = new java.util.Scanner(System.in).nextInt();

        int h = S / 3600;
        int m = S % 3600 / 60;
        int s = S % 3600 / 60;

        out.print(hour + ":");
        out.print(minute + ":");
        out.println(second);
}