import java.util.Scanner;

class Main {
    static int calc(int a) {
    int num =0;
        if(400<=a&&a<=599){
            num=8;
        }else if(600<=a&&a<=799) {
            num=7;
        }else if(800<=a&&a<=999) {
            num=6;
        }else if(1000<=a&&a<=1199) {
            num=5;
        }else if(1200<=a&&a<=1399) {
            num=4;
        }else if(1400<=a&&a<=1599) {
            num=3;
        }else if(1600<=a&&a<=1799) {
            num=2;
        }else if(1800<=a&&a<=1999) {
            num=1;
        }
        System.out.println(num);
        return num;

   }

   public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int a = stdIn.nextInt();
    calc(a);

   }

}
