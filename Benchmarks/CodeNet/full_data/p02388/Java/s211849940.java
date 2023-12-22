import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = br.readLine();
            System.out.println(getInputNumber(line));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static double getInputNumber(String line){
    	int x = Integer.parseInt(line);
    	double y = Math.pow(x,3);
		return y;
    	
    }
}