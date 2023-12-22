import java.io.*;

public class Main{
    public static void main(String[]args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String linea = reader.readLine();
            String lineb = reader.readLine();
            String linec = reader.readLine();
            int a = Integer.parseInt(linea);
            int b = Integer.parseInt(lineb);
            int c = Integer.parseInt(linec);
            if(a<b || b<c){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println("数字の形式が正しくありません。");
        }
    }
}
