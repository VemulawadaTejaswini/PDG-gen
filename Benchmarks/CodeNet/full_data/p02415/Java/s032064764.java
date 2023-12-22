import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int i = 0;
            String line;
            line = reader.readLine();
            String[] charactor = line.split("",line.length());
            String[] output;
            String tmp;
            output = new String[line.length()];
            for(i = 0; i < line.length(); i++){
                tmp = charactor[i];
                tmp = tmp.toLowerCase();
                if(charactor[i].equals(tmp) == true){
                    output[i] = charactor[i].toUpperCase();
                }else if(charactor[i].equals(tmp) == false){
                    output[i] = charactor[i].toLowerCase();
                }else{
                    output[i] = charactor[i];
                }
            }
            for(i = 0; i < line.length(); i++){
                System.out.print(output[i]);
            }
            System.out.print("\n");

        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
