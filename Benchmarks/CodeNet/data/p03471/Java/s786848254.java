import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        int N = Integer.parseInt(tmp[0]); //お札の枚数
        int Y = Integer.parseInt(tmp[1]); //金額
        int x = -1; 
        int y = -1;
        int z = -1; // x,y,z それぞれ１００００円、５０００円、１０００円
        if(Y >= 100000){
            for (int i=0; i<=N; i++){
                for (int j=0; j<=N-i; j++){
                    if(Y == 10000*i + 5000*j + 1000*(N-i-j)){
                        x = i;
                        y = j;
                        z = N-i-j;
                    }
                }
            }
        } else {
            for (int i=0; i<=N; i++){
                for (int j=0; j<=N-i; j++){
                    if(Y == 1000*i + 5000*j + 10000*(N-i-j)){
                        z = i;
                        y = j;
                        x = N-i-j;
                    }
                }
            }
        }
        System.out.println(x + " " + y + " " + z);
    }
}