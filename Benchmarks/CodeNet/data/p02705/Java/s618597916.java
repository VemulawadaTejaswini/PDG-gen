import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) {
		Main cd = new Main();
        System.out.println(cd.calculate());
	}

    private final String ERROR_INPUT_INT = "入力値は実数ではありません。";

    private String input() throws IOException{
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        line = reader.readLine();
        return line;
    }


    public Integer inputInt() { //double型の数値を入力できるメソッド
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

	public double calculate() {
		return 2*this.inputInt()*Math.PI;
	}

}