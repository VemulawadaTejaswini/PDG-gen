import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double minRad = m / 30.0 * Math.PI;
        double hourRad = (h / 6.0 + m / (30.0 * 12.0)) * Math.PI;

        double minx = b * Math.sin(minRad);
        double miny = b * Math.cos(minRad);

        double houx = a * Math.sin(hourRad);
        double houy = a * Math.cos(hourRad);

        double difx = minx - houx;
        double dify = miny - houy;

        // 出力
        System.out.println(Math.sqrt(difx *difx + dify * dify));
    }
}