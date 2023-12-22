import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = br.readLine();

            StringBuffer lineStr = new StringBuffer(line);
            System.out.print(lineStr.reverse().toString());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	
}