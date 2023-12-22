import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int input = inp.nextInt();
        int jam, menit, detik;
        jam = input / 3600;
        menit = (input % 3600)/60;
        detik = (input % 3600)%60;
        System.out.println(jam+":"+menit+":"+detik);
    }
}
