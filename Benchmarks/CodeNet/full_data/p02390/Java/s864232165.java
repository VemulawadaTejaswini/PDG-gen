import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = t%60;
        int m = (t-s)/60%60;
        System.out.println((t-s-m*60)/3600 + ":" + m + ":" + s);
    }
}
