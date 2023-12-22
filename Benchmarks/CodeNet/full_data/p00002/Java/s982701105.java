import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        try{
            while((s=br.readLine())!=null){
                String[] str=s.split(" ");
                int n=Integer.parseInt(str[0])+Integer.parseInt(str[1]);
                System.out.println(Integer.toString(n).length());
            }
            br.close();
        }catch(Exception e){
        }
    }
}