import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int h=Integer.parseInt(st.nextToken());
            int w=Integer.parseInt(st.nextToken());
            boolean h_bool=false;
            boolean w_bool=!h_bool;
            if(w==0&&h==0) break;
            for(int i=0;i<h;i++){
                h_bool=!h_bool;
                w_bool=!h_bool;
                for(int j=0;j<w;j++){
                    w_bool=!w_bool;
                    if(w_bool) System.out.print("#");
                    else System.out.print(".");
                }System.out.println();
            }System.out.println();
        }
    }
}