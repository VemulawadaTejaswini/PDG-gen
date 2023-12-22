import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
           int y=sc.nextInt();
           int m=sc.nextInt();
           int d=sc.nextInt();
           int s=y*10000+m*100+d;
           if(19890108<=s) {
               System.out.println("heisei "+(y-1988)+" "+m+" "+d);
           }else if(19261225<=s) {
               System.out.println("showa "+(y-1925)+" "+m+" "+d);
           }else if(19120730<=s) {
               System.out.println("taisho "+(y-1911)+" "+m+" "+d);
           }else if(18680908<=s){
               System.out.println("meiji "+(y-1867)+" "+m+" "+d);
           }else {
               System.out.println("pre-meiji");
           }
        }
    }
}
