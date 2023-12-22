import java.io.BufferedReader;

import java.io.InputStreamReader;
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = br.readLine();
            
            System.out.println(getCubeOf(line));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static double getCubeOf(String line) {
    	long x = Long.parseLong(line);
    	return (long)Math.pow(x, 3);
    }
}