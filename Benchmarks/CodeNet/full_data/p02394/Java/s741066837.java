import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int a = Math.abs(Integer.parseInt(strArr[0]));
        int b = Math.abs(Integer.parseInt(strArr[1]));
        int c = Math.abs(Integer.parseInt(strArr[2]));
        int d = Math.abs(Integer.parseInt(strArr[3]));
        int e = Math.abs(Integer.parseInt(strArr[4]));

        if(c+e <= a && d+e <= b && 0<=c-e && 0 <= d-e){
        	System.out.println("Yes");
        }

        else{
        	System.out.println("No");
        }
    }
}