import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    private final String ERROR_INPUT_INT = "入力値は実数ではありません。";

    private String input(){
        String line;
        try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        line = reader.readLine();
        return line;
        }catch (Exception e) {
        	return "error";
        }
    }


    public Integer inputInt() {
        try{
            String value = this.input();
            Integer n = Integer.parseInt(value);
            return n;
        }
        catch (Exception s){
            System.out.println(ERROR_INPUT_INT);
            return this.inputInt();
        }
    }

    public int calculate() {
    	int sum = 0;
    	String[] mae = this.input().split(" ");
    	String[] ato = this.input().split(" ");
    	for(int i=0;i<Integer.parseInt(mae[1]);i++) {
    		sum += Integer.parseInt(ato[i]);
    	}
    	int ans = Integer.parseInt(mae[0])-sum;

    	if(ans>=0)
    		return ans;
    	else
    		return -1;
    }


    public static void main(String[] args) {
    	Main a = new Main();
    	System.out.println(a.calculate());
    }
}