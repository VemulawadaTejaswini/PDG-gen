import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] sl = str.split(" ");
        int R = Integer.parseInt(sl[0]);
        int G = Integer.parseInt(sl[1]);
        int B = Integer.parseInt(sl[2]);
        int N = Integer.parseInt(sl[3]);
        int ans = 0;
        for (int r=0;r<=N;r+=R){
            for (int g=0;g<=N-r;g+=G){
                if ((N-(r+g))%B==0){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}