import javax.script.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-- != 0){
			String query = sc.nextLine();
			try {
				engine.eval("println(" + query.substring(0, query.length() - 1) + ");");
			}catch(ScriptException e){
				// nothing to do
			}
		}
	}
}