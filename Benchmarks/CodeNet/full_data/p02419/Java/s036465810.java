import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String st = sc.readLine();
		String s;
		int count = 0;
		flag:
		while(true){
			String[] str = sc.readLine().toLowerCase().split(" ");
			for(String i:str){
				if(i.equals("end_of_text")){
					break flag;
				}else if(i.equals(st)){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}