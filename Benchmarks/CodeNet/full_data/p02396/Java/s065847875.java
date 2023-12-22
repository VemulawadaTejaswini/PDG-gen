import java.io.*;

public class Main{
    public static void main(String []args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int [] number;
            number = new int[10000];
            for(int i=0;i<10000;i++){
            String line = reader.readLine();
            number[i] =Integer.parseInt(line);
            if(number[i] == 0){
                break;
            } 
            }
            for(int j=1;j<=10000;j++){
                System.out.println("case "+j+": "+number[j-1]);
                if(number[j-1]==0){
                    break;
                }
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
