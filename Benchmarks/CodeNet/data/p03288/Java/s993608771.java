import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (Integer.parseInt(str) < 1200){
            System.out.println("ABC");
        } else if (Integer.parseInt(str) < 2800){
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}