import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<Integer>();
		while(scan.hasNextLine()){
			String aa = scan.next();
			String op = scan.next();
			String bb = scan.next();
			int a = Integer.parseInt(aa);
			int b = Integer.parseInt(bb);
			int cal =0;
			
			if(op == "?"){
				break;
			}
			else{
				if(op == "+"){
					cal = a + b;
				}
				if(op == "-"){
					cal = a - b;
				}
				if(op == "*"){
					cal = a * b;
				}
				if(op == "/"){
					cal = a / b;
				}
				
				
				list.add(cal);			
			}
		}
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}