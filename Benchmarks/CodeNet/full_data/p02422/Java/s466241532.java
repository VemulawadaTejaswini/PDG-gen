import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MyString str = new MyString(br.readLine());
		int q = Integer.parseInt(br.readLine());
		for(int i = 0;i < q;i++){
			String[] line = br.readLine().split(" ");
			String command = line[0];
			switch(command){
			case "print":
				str.print(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
				break;
			case "reverse":
				str.reverse(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
				break;
			case "replace":
				str.replace(Integer.parseInt(line[1]), Integer.parseInt(line[2]), line[3]);
				break;
			default:
			}
		}
	}

	
}

class MyString {
	private String value;
	
	public MyString(){
		value = "";
	}
	
	public MyString(String value){
		this.value = value;
	}
	
	public void print(int a, int b){
		System.out.println(value.substring(a, b + 1));
	}
	
	public void reverse(int a, int b){
		StringBuilder sb = new StringBuilder();
		
		sb.append(value.substring(0, a));
		sb.append((new StringBuilder()).append(value.substring(a, b + 1)).reverse().toString());
		sb.append(value.substring(b + 1));
		
		this.value = sb.toString();
	}
	
	public void replace(int a, int b, String p){
		StringBuilder sb = new StringBuilder();
		
		sb.append(value.substring(0, a));
		sb.append(p);
		sb.append(value.substring(b + 1));
		
		this.value = sb.toString();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}