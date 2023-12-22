import java.io.*;

public class Main{

    public static void main(String[]args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strS = br.readLine();
        String strP = br.readLine();

        strS = strS + strS;
        if(strS.indexOf(strP) != -1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}