import java.io.*;

public class Main {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] dat ;
        try {
            dat= reader.readLine().split(" ");
            int W=Integer.parseInt(dat[0]);
            int H=Integer.parseInt(dat[1]);
            int x=Integer.parseInt(dat[2]);
            int y=Integer.parseInt(dat[3]);
            int r=Integer.parseInt(dat[4]);
            if(x-r>0&&x+r<W&&y-r>0&&y+r<H){
                System.out.print("Yes");
            }else{
                System.out.print("No");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}