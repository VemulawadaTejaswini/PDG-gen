import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int H1 = scan.nextInt();
        int M1 = scan.nextInt();
        int H2 = scan.nextInt();
        int M2 = scan.nextInt();
        int K = scan.nextInt();
if (H1>H2){H2=H2+24;}
        if (M1>M2){M2=M2+60;}

int YH=H2-H1;
int YM=M2-M1;

int L=YM+YH*60;
L=L-K;
System.out.println(L);




    }


        }





