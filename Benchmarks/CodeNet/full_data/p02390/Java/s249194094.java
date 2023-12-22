import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String line=br.readLine();
        int time = Integer.parseInt(line);
        int sec=0,min=0,hour=0;
        
        if (time>=3600) {
            hour=time/3600;
            time=time%3600;
            min=time/60;
            sec=time%60;
            System.out.println(hour+":"+min+":"+sec);
        }
        else if (time>=60) {
            min=time/60;
            sec=time%60;
            System.out.println(hour+":"+min+":"+sec);
        }
        else{
            System.out.println(hour+":"+min+":"+sec);
        }
    }
}