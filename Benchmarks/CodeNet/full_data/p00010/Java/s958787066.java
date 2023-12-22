import java.io.*;

public class Main {

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String st = br.readLine();
            int n = Integer.parseInt(st);
            while(true){
                st = br.readLine();
                if(st==null){
                    break;
                }
                String[] s = st.split(" ", 0);
                double x1=Integer.parseInt(s[0]);
                double y1=Integer.parseInt(s[1]);
                double x2=Integer.parseInt(s[2]);
                double y2=Integer.parseInt(s[3]);
                double x3=Integer.parseInt(s[4]);
                double y3=Integer.parseInt(s[5]);
                double px=(x1+x2+x3)/3.0;
                double py=(y1+y2+y3)/3.0;
                double r = Math.sqrt(Math.pow(px-x1, 2)+Math.pow(py-y1, 2));
                System.out.printf("%.3f %.3f %.3f",px,py,r);
            }
        }catch(IOException e){
            
        }
    }
}