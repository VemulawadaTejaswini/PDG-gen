import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = br.readLine();
            
            int a = Integer.parseInt(line.substring(0, line.indexOf(" ")));
            int b = Integer.parseInt(line.substring(line.indexOf(" ")+1));
            
            if(a<b){
            	System.out.println("a < b");
            }else if(a>b){
            	System.out.println("a > b");
            }else{
            	System.out.println("a == b");
            }
   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}