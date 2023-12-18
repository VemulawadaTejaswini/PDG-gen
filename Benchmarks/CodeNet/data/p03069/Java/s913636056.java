import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = 
            new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String S = bf.readLine();
        int x = 0,
            y = 0;
        for(int i = 0; i < N; i++){
            if(S.charAt(i) == '.'){
                x++;
            } else{
                y++;
            }
        }
        System.out.println(Math.min(x,y));
    }
}