import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] array = input.split(" ");
        int x = Integer.parseInt(array[0]);
        int a = Integer.parseInt(array[1]);

        if(x < a){
            System.out.println(0);
        }else{
            System.out.println(10);
        }
    }
}