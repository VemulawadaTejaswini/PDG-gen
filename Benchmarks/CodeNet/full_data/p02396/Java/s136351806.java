import java.io.*;
public class Main{
    public static void main(String args[]){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i=0;
        String[] line;
        line = new String[256];
        try{
        while(i<256){
            line[i] = reader.readLine();
            if(line[i].equals("0"))  break;
            i++;
        }
        i=0;
        while(i<256){
            if(line[i].equals("0"))  break;
            System.out.println("Case "+(i+1)+": "+line[i]);
            i++;
        }
    }catch(IOException e){
        System.out.println(e);
    }catch(NumberFormatException e){
        System.out.println(e);
    }
    }
}
