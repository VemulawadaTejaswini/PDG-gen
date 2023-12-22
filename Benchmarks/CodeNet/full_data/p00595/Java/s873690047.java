import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = br.readLine();
            System.out.println(commonDivisor(line));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int commonDivisor(String line) {
    int x = Integer.parseInt(line.substring(0, line.indexOf(" ")));
    int y = Integer.parseInt(line.substring(line.indexOf(" ")+1));
    
    if(x < y){
    	int tmp = x;
    	x = y;
    	y = tmp;
    }
    
    return gcd(x, y);
    }

	private static int gcd(int x, int y) {
		// TODO Auto-generated method stub
		while(y>0){
			 int r = x % y;
				 x = y;
				 y = r;
		}
		return x;
	}
}