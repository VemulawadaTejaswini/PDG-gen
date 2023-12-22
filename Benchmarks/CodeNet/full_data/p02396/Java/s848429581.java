import java.io.*;
public class Main{
    public static void main(String args[]){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i=0;
        String[] line;
        line = new String[100];
        try{
        for(i=0;i<100;i++){
            line[i] = reader.readLine();
            if(line[i].equals("0"))  break;
        }
        i=0;
        for(i=0;i<100;i++){
            if(line[i].equals("0"))  break;
            System.out.println("Case"+i+":"+line[i]);
        }
    }catch(IOException e){
        System.out.println(e);
    }catch(NumberFormatException e){
        System.out.println(e);
    }
    }
}
