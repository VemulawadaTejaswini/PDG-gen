import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException {
        int cnt,s; 
        String str,chr;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        chr = in.readLine(); cnt=0;
        while((str=in.readLine()) != null){
            if(str.equals("END_OF_TEXT")) break;
            s=0;
            while(str.indexOf(chr,s) != -1){
                s = str.indexOf(chr, s)+chr.length();
                cnt+=1;
            }
        }
        System.out.println(cnt);
        System.out.flush();
    }
}