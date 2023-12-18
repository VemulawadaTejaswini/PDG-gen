import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int A;
        int B;
        Scanner sc = new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        int C=A+B;
        int D=A-B;
        int E=A*B;
        if(C>=D&&C>=E){
           System.out.println(A+B);return;
        }
        if(D>=C&&D>=E){
           System.out.println(A-B);return;
        }
        if(E>=C&&E>=D){
            System.out.println(A*B);return;
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
    }
}
