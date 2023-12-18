import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = 
            new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String S = bf.readLine();
        int count = 0;
        for(int i = 0; i < N; i++){
            int start = i;
            while(i < N && S.charAt(i) == '.'){
                i++;
            }
            count += i-start;
        }
        System.out.println(count);
    }
}