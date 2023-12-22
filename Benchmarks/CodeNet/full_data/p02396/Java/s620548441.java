import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int j = 0;

        String[] str = br.readLine().split("\n");
        int[] num = new int[str.length];
        for(int i=0; i<str.length; i++){
            num[i] = Integer.parseInt(str[i]);
        }
        while(true){
            if(num[j] != 0){
                System.out.println("Case "+ j +": " + num[j]);
                j++;
            }else{
                break;
            }
        }
    }
}