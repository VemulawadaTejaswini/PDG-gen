import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            
            int i = 0;
            
            String line; 
            
            while ((line = br.readLine()) != null) {
                ++i;
            	int x = Integer.parseInt(line);
            	if(x==0){ break;}
            	System.out.println("Case "+i+": "+ x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}