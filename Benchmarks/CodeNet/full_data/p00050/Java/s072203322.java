import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String input = in.nextLine();
			String result = "";
			for(int i=0;i<input.length();i++){
				String test = "";
				if(input.length()>i+4)test=input.substring(i,i+5);
				if(test.equals("apple")){
					i+=4;
					result+="peach";
				}else if(test.equals("peach")){
					i+=4;
					result+="apple";
				}else result+=input.charAt(i);
			}
			System.out.println(result);
		}
	}
}