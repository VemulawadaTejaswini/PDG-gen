import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        String[] s = br.readLine().split(" ");
        int[] coodinate = new int[s.length];
        for(int i=0; i<s.length; i++){
            coodinate[i] = Integer.parseInt(s[i]);
        }
        int costTotal =0;
        for(int i=0; i<coodinate.length - 1; i++){
        int costNext = Math.min(a*(coodinate[i+1]-coodinate[i]),b);
        costTotal += costNext;
        }
        System.out.println(costTotal);
    }
}