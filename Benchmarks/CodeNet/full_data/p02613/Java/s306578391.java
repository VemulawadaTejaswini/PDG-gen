import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int ac=0;
        int wa=0;
        int tle=0;
        int re=0;
        String b ="";
        for(int i=0; i<=a; i++){
            b=sc.nextLine();
            if(b.equals("AC")){
                ac++;
            }else if(b.equals("WA")){
                wa++;
            }else if(b.equals("TLE")){
                tle++;
        }
    }
    re = a-(ac+wa+tle);
    System.out.println("AC x " +ac);
    System.out.println("WA x " + wa);
    System.out.println("TLE x "+ tle);
    System.out.println("RE x "+ re);
}
}