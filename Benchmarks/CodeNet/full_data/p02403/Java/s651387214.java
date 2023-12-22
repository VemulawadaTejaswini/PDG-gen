import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int x,y;
        while(true){
            String[] str=buf.readLine().split(" ");
            if(str[0].equals("0") && str[1].equals("0"))break;
             x=Integer.parseInt(str[0]);
             y=Integer.parseInt(str[1]);
             
             
             for(int i=0;i<x;i++){
                 for(int j=0;j<y;j++){
                     System.out.print("#");
                 }
                 System.out.println();
             }
        }
    }
}