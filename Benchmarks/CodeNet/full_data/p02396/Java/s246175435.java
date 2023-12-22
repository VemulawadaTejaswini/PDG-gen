import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
        	String line = br.readLine();
        	int i = 1;
        	while(i < 10){
        		int num = Integer.parseInt(line);
            	System.out.println("Case " + i + ": " + num);
            	i++;
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}