import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str =br.readLine();

        int touA[][]= new int[3][10];
        
        int touB[][];
        touB = new int[3][10];

        int touC[][];
        touC = new int[3][10];

        int touD[][];
        touD = new int[3][10];



            while(str != null){

            String[] line = str.split("\\s");

            int b = Integer.parseInt(line[0]);
            int f = Integer.parseInt(line[1]);
            int r = Integer.parseInt(line[2]);
            int v = Integer.parseInt(line[3]);

                if(b == 1){
                    int tempn;
                    tempn = touA[f-1][r-1];
                    tempn += v;
                    touA[f-1][r-1] = tempn;
                //System.out.println(tempn);
                }
                if(b == 2){
                    int tempn;
                    tempn = touB[f-1][r-1];
                    tempn += v;
                    touB[f-1][r-1] = tempn;
                //System.out.println(tempn);
                }
                if(b == 3){
                    int tempn ;
                    tempn = touC[f-1][r-1];
                    tempn += v;
                    touC[f-1][r-1] = tempn;
                //System.out.println(tempn);
                }
                if(b == 4){
                    int tempn ;
                    tempn = touD[f-1][r-1];
                    tempn += v;
                    touD[f-1][r-1] = tempn;
                //System.out.println(tempn);
                }
                str = br.readLine();

            }

            StringBuilder out = new StringBuilder();
            for(int i=0;i<3;i++){
                for(int j =0;j<10;j++){
                    String x = String.valueOf(touA[i][j]);
                    out.append(" ");
                    out.append(x);
                }
                out.append("\n");
            }
            out.append("####################");
            out.append("\n");

            for(int i=0;i<3;i++){
                for(int j =0;j<10;j++){
                    String x = String.valueOf(touB[i][j]);
                    out.append(" ");
                    out.append(x);
                }
                out.append("\n");
            }
            out.append("####################");
            out.append("\n");                        

            for(int i=0;i<3;i++){
                for(int j =0;j<10;j++){
                    String x = String.valueOf(touC[i][j]);
                    out.append(" ");
                    out.append(x);
                }
                out.append("\n");
            }
            out.append("####################");
            out.append("\n");

            for(int i=0;i<3;i++){
                for(int j =0;j<10;j++){
                    String x = String.valueOf(touD[i][j]);
                    out.append(" ");
                    out.append(x);
                }
                if(i ==2){
                    break;
                }else{
                out.append("\n");
                }
            }
            
            System.out.println(out.toString());
    }
}