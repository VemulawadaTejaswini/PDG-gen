import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = 
            new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int A = Integer.parseInt(str[0]),
            B = Integer.parseInt(str[1]),
            C = Integer.parseInt(str[2]);
        boolean b = (A-B)*(B-C) >= 0;
        if(b){
            System.out.println("No");
        } else{
            System.out.println("Yes");
        }
    }
}