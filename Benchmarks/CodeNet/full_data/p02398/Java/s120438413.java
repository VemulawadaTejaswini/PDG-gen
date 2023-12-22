import java.io.*;
class Main{
    public static void main(String[] args)throws IOException{
        BUfferedReader br = new BUfferedReader(new InputStreamreader(System.in));
        String str = br.readLine();
        String[] strs = str.split(" ");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);
        int c = Integer.parseInt(strs[2]);
        int cnt = 0;
        for(int i = a; i <= b; i++){
            if((c % 1) == 0){
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}