import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String[] l = reader.readLine().split(" ");
        int N = Integer.parseInt(l[0]);
        int M = Integer.parseInt(l[1]);
        String res="";
        if(N>M){
            for(int i= 0;i<N;i++){
                res=res+Integer.toString(M);
            }
        }
        else{
            for(int i= 0;i<M;i++){
                res=res+Integer.toString(N);
            }
        }
        System.out.println(res);
    }
}
