import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int T = 1;
        for(int i=0; i < M; i++){
            T = T*2;
        }
        int t = 100*(N-M)+1900*M;
        System.out.println(t*T);
    }
}