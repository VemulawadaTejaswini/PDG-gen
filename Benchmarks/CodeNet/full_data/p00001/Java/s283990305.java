import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] highs = new int[10];
            for(int i=0;i<highs.length;i++){
                highs[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(highs);
            for(int i=highs.length-1;i>=highs.length-3;i--){
                System.out.println(highs[i]);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
	}
}