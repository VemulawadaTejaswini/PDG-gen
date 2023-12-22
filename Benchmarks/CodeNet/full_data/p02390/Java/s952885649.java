import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader r =
         new BufferedReader(new InputStreamReader(System.in), 1);
         
        String line = r.readLine();    
        Long s = Long.parseLong(line);
        if ((0<=s) & (s<=86400)){
            long hour = s != 0 ? s / (60 * 60) : 0;
            long zan = s - hour * 60 * 60;
            long minute = zan != 0 ? zan / 60 :0;
            zan = zan - minute * 60;       
            System.out.println(hour+":"+minute+":"+zan);
        }
        r.close();
    }
}