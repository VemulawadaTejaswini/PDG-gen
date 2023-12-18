import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int h=scan.nextInt();
        int a=scan.nextInt();
        int c=0;
        for(;h>0;){
            h-=a;
            c++;
        }
        System.out.println(c);


    }

}