import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] S = scanner.next[100];
        
        for(int i = 0; i < S.length; i++){
            S[i] = "x";
        }

        System.out.println(S);
	}
}