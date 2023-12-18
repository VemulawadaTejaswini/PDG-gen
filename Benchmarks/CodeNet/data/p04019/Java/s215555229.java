import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int N=0;
        int S=0;
        int E=0;
        int W=0;
        for(char c:s.toCharArray()){
            if(c=='N'){
                N=1;
            }else if(c=='S'){
                S=1;
            }else if(c=='E'){
                E=1;
            }else if(c=='W'){
                W=1;
            }
        }System.out.println((N+S+E+W)%2==0 ? "Yes":"No");
    }
}