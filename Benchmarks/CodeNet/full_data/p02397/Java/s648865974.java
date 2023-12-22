import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String[] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);

            if(x == 0 && y == 0){
                break;
            }else if(x > y){
                sb.append(x<y?x:y).append(" ").append(x<y?x:y);
            }
            System.out.println(sb);
        }
    }
}