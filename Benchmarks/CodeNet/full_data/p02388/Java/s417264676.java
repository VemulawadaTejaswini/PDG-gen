import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            double ans = Math.pow(Integer.parseInt(line), 3);
            System.out.println(ans);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}