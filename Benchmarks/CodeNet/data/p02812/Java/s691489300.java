import java.util.Scanner;

public class Main {
    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        byte[] S;
        S = scanner.next().getBytes();
        int abcCount=0;
        for(int i=0;i<N-2;i++){
            if(S[i]=='A' && S[i+1]=='B'&& S[i+2]=='C'){
                abcCount++;
            }
        }
        System.out.println(abcCount);
    }
}




