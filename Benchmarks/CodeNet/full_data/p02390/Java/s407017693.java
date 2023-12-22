import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner InData = new Scanner(System.in);
    int t = InData.nextInt();
    int s = t%60;
    int m = t/60;
    int h = m/60;
    m = m%60;
    System.out.println(h+":"+m+":"+s);
    }
}