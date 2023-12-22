import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int tate = Integer.parseInt(input[0]);
        int yoko = Integer.parseInt(input[1]);
        if(tate < 1 || yoko < 1 || tate > 100 || yoko > 100){
            System.out.println("Error");
        }
        
        int men = 0;
        int nag = 0;
        
        men = tate * yoko;
        nag = (tate + yoko) * 2;
        
        System.out.println(men + " " + nag);
    }

}