import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String[] str = br.readLine().split(" ");
            int h = Integer.parseInt(str[0]);
            int w = Integer.parseInt(str[1]);
            StringBuilder sb = new StringBuilder();

            if( h == 0 && w == 0)break;
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    sb.append("#");
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }

    }
}