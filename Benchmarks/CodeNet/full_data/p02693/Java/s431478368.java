import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        int K;
        String str;
        String[] A = new String[2];
        String ans = "NG";
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        K = Integer.parseInt(r.readLine());
        str = r.readLine();
        A = (str.split(" "));
        for(int i=1;i*K <= Integer.parseInt(A[1]);i++){
            if(Integer.parseInt(A[0]) <= i*K && i*K <= Integer.parseInt(A[1])){
                ans="OK";
                continue;
            }
        }
        System.out.println(ans);
    }
}