import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = 
            new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String S = bf.readLine();
        int min = N;
        for(int i = 0; i < N; i++){
            int count = 0;
            for(int j = 0; j < i; j++){
                if(S.charAt(j) == '#'){
                    count++;
                }
            }
            for(int j = i; j < N; j++){
                if(S.charAt(j) == '.'){
                    count++;
                }
            }
            min = Math.min(min, count);
        }
        System.out.println(min);
    }
}