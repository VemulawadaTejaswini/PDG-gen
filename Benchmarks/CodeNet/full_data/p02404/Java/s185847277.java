import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        while(str != null){
            String[] line = str.split("\\s");
            int H = Integer.parseInt(line[0]);
            int W = Integer.parseInt(line[1]);
            //System.out.println(H);
            //System.out.println(W);

            if(H ==0 && W == 0){
                break;
            }else{
                String TB = createTB(W);
                String IW = createIW(W);
                
                System.out.println(TB);
                for(int i=0;i<H-2;i++){
                    System.out.println(IW);
                }
                System.out.println(TB);
                System.out.println("");
            }
            str =br.readLine();
        }
        br.close();
    }

    public static String createTB(int W){
        String temp ="";
        for(int i =0;i<W;i++){
            temp +="#";
        }
        return temp;
    }
    
    public static String createIW(int W){
        StringBuilder temp = new StringBuilder();
            temp.append("#");
            for(int i=0;i<W-2;i++){
                temp.append(".");
            }
                temp.append("#");
                return temp.toString();
        }
}