import java.util.Scanner;
public class DiagonalString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split("");
        String[] b = sc.nextLine().split("");
        String[] c = sc.nextLine().split("");
        String top =a[0];
        String middle = b[1];
        String bottom = c[2];
        System.out.println(top +""+ middle + "" + bottom);
    }
}
