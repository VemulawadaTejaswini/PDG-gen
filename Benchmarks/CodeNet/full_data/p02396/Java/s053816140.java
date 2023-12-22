import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
        	String line = br.readLine();
        	int num = Integer.parseInt(line);
        	int i = 1;
        	while(i < 10001){
            	System.out.println("Case " + i + ": " + num);
            	i++;
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}