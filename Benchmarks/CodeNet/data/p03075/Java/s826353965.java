import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int a = Integer.parseInt(str);
        str = br.readLine();
        int b = Integer.parseInt(str);
        str = br.readLine();
        int c = Integer.parseInt(str);
        str = br.readLine();
        int d = Integer.parseInt(str);
        str = br.readLine();
        int e = Integer.parseInt(str);
        str = br.readLine();
        int k = Integer.parseInt(str);
        if (e-a>k){
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }
    }
}