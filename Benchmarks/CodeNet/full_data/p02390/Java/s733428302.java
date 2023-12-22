import java.io.*;
public class Main{  
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String txt1 = reader.readLine();
			int i = Integer.parseInt(txt1);
			int time;
			int h;
			int m;
			int s;
			h = i / 3600;
			time = h + i % 3600;
			m = time / 60;
			s = i - (h * 3600 + m * 60);
			
			System.out.println(h + ":" + m + ":" + s);

        }catch(IOException e){
            System.out.println(e);
        }
    }
}