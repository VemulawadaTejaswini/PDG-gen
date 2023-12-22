import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println(Main.time());
    }

    public static String time(){
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int h = (S-S%3600)/3600;
        int m = ((S-h*3600)-(S-h*3600)%60)/60;
        int s = (S-h*3600-m*60);
        return h+":"+m+":"+s;
    }
}

