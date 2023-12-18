import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int D =sc.nextInt();
        int D2 = D*2+1;
        int opt = N%D2;
        int opt2 = N/D2;
        if(opt==0) System.out.println(opt2);
        else System.out.println(opt2+1);
    }
}
