import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    int N= 4/cin.nextInt();
    int h ,n ,w;
    h=0;
    n=0;
    w=0;

    do{
            h++;
            for (n=0;n<3500;n++)
            {
                w=N-n-h;
            }
    }while (w<0);
        System.out.println(w +" "+n+" "+h);
    }

}