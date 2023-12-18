import java.util.Scanner;
public class DuplexPrinting20200301 {
    private int N;
    private int anser;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        N=scan.nextInt();
        if(N%2==0){
            System.out.println(N/2);
        }else{
            System.out.println(N/2 + 1);
        }
    }
}