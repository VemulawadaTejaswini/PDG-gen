import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException {
        int cnt,i; 
        String line,chr;
        String[] str = new String[1000];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        chr = in.readLine(); cnt=0;
        while((line=in.readLine()) != null){
            if("END_OF_TEXT".equals(line)) break;
            str = line.split(" ",-1);
            for(i=0;i<str.length;i++){
                if(str[i].equalsIgnoreCase(chr)) cnt+=1;
            }
        }
        System.out.println(cnt);
        System.out.flush();
    }
}