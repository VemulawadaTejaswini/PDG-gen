import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> array = new ArrayList<String>();

		try {
			String str = null;
			while ((str = br.readLine()) != null) {
				array.add(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		for(String s : array) {
			String[] data = s.split(" ");
			LinkedList<Double> list = new LinkedList<Double>();
			
			int fugo = 1;
			for(String value : data) {
				String regex = "^[+\\-*/]$";
				Pattern p = Pattern.compile(regex);
				Matcher m = p.matcher(value);
				if(m.find() == false) {
					//数字
					list.push(Double.valueOf(value)  * fugo);
					fugo = 1;
				} else {
					if(list.size() == 0 && value.equals("-")) {
						fugo = -1;
						continue;
					}
					
					double a = list.pop();
					double b = list.pop();
					
					char c = value.charAt(0);
					switch((int)c) {
					case '+' :list.push(b + a); break;
					case '-' :list.push(b - a); break;
					case '*' :list.push(b * a); break;
					case '/' :list.push(b / a); break;
					}
				}
			}
			System.out.println(list.pop());
		}
	}
}