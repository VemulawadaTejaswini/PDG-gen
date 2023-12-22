import java.io.*;
import java.util.*;


class Main {
    void run() throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] ri = {"y","u","i","o","p","h","j","k","l","n","m"};

        while(true){
            int ans = 0;
            int pref = 2;
            String[] num = in.readLine().split("",0);
            if(Objects.equals(num[0],"#")) break;
            int flag = 0;
            for(int i = 0; i < num.length; i++) {
                if(Arrays.asList(ri).contains(num[i])){
                    flag = 1;
                }
                else{
                    flag = 0;
                }
                if(flag!=pref&&pref!=2){
                    ans+=1;
                }
                pref=flag;
            }
            System.out.println(ans);
        }
    }
    public static void main(String[] args) throws IOException{
        Main ma = new Main();
        ma.run();
    }
}