import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strarr = str.split(" ");
        int num1 = Integer.parseInt(strarr[0]);
        int num2 = Integer.parseInt(strarr[1]);
        int num3 = Integer.parseInt(strarr[2]);
        
        if((num1 < num2) && (num2 < num3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
}
