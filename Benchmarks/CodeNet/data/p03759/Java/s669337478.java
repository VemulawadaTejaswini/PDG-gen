import java.util.Scanner;

public class Main {





    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a,b,c;
        a= s.nextInt();
        b=s.nextInt();
        c=s.nextInt();

        int pole = b-a;
        int pole2=c-b;

        if(pole ==pole2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }

}
