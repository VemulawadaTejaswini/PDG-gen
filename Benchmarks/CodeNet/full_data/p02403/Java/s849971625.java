import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
      
        while(true){
            int x,y;
            
            String num[]=buf.readLine().split(" ");
            if(num[0].equals("0") && num[1].equals("0"))break;
                x=Integer.parseInt(num[0]);
                y=Integer.parseInt(num[1]);
        
                for(int i=0;i<x;i++){
                    for(int j=0;j<y;j++){
                        System.out.print("#");
                }
                    System.out.println();
                }
        }
    }
}