import java.io.*;
import java.util.*;

class Main{
    void run() throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        int[] menber = new int[num];
        for(int i = 0;i < num;i++){
            menber[i] = Integer.parseInt(in.readLine());
        }
        int count = 0;
        int ans = 0;
        for(int i = 0;i < num;i++){
            for(int j = i+1;j < num;j++){
                if(ans <= (menber[j] - menber[i]) && count != 0){
                    ans = menber[j] - menber[i];
                }
                else if(count == 0){
                    ans = menber[j] - menber[i];
                    count++;
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) throws IOException{
        Main ma = new Main();
        ma.run();
    }
}