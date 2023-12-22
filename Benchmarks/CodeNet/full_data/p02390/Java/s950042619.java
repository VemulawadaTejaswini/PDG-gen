import java.io.*;
public class Main{  
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int time = Integer.parseInt(reader.readLine());
			int h = time / 3600;
			int m = (time % 3600) / 60;
			int s = (time % 3600) % 60;
			System.out.println(h + ":" + m + ":" + s);

        }catch(IOException e){
            System.out.println(e);
        }
    }
}