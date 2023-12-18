import java.util.Scanner;

public class Main {
    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
//        byte[] S= new byte[N+2];
       byte[] S = scanner.next().getBytes();
        int abcCount=0;
        for(int i=2;i<N;i++){
            if(S[i-2]=='A' && S[i-1]=='B'&& S[i]=='C'){
                abcCount++;
            }
        }
        System.out.println(abcCount);

    }
}




