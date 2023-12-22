import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            int i;
            for(i=0;i<=n;i++){
                if(i%3==0 || String.valueOf(i).contains("3")){
                    System.out.print(" "+i);
                }
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
