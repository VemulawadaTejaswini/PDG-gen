import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int h,m,s;
        h=(S-S%3600)/3600;
        m=((S-h*3600)-(S-h*3600)%60)/60;
        s=S-h*3600-m*60;
        System.out.printf("%d:%d:%d",h,m,s);
    }
}
