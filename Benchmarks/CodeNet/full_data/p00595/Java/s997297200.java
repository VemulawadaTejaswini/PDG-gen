import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            while(line != null) {
            	String[] list = line.split(" ", 0);
            int 	x = Integer.parseInt(list[0]);
            	int y = Integer.parseInt(list[1]);
            	if (x < y){
                    int r = x;
                    x = y;
                    y = r;
                }
            	System.out.println(getCubicOf(x, y));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static long getCubicOf(int x, int y) {
    	if(y == 0) {
            return x;
        }else{
            return getCubicOf(y, x % y);
        }
    }
}