import java.io.*;

class Main{
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            int r = Integer.parseInt(line);
            System.out.println(r*r*Math.PI + " " + r*2*Math.PI);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
