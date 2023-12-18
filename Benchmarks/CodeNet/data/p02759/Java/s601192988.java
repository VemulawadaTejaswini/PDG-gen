import java.util.Scanner;
public class 20200301DuplexPrinting {
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