import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);

            if(x == 0 && y == 0){
                break;
            }else if(x > y){
                int swp = x;
                x = y;
                y = swp;
            }
            System.out.println(x +" "+ y);
        }
    }
}