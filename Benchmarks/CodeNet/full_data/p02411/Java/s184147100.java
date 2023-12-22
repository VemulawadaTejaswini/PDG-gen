
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) throws NumberFormatException,IndexOutOfBoundsException,IOException{
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0;;i++){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		int tyuukan = Integer.parseInt(input[0]);
		int kimatu = Integer.parseInt(input[1]);
		int saisiken = Integer.parseInt(input[2]);
		
		if(tyuukan == -1 && kimatu == -1 && saisiken == -1){
			break;
		}
		if(tyuukan + kimatu >= 80){
			list.add(i,"A");
		}else if(65<=tyuukan+kimatu && tyuukan+kimatu <80){
			list.add(i,"B");
		}else if(50<=tyuukan+kimatu && tyuukan+kimatu <65){
			list.add(i,"C");
		}else if(30<=tyuukan+kimatu && tyuukan+kimatu <50){
			if(saisiken <= 50){
				list.add(i,"C");
			}else{
				list.add(i,"D");
			}
		}else if(30>tyuukan+kimatu){
			list.add(i,"F");
		}
			
		if(tyuukan == -1 || kimatu == -1){
			list.add(i,"F");
			
		}
		}
		for ( int j=0;j<list.size();j++){
			String text = list.get(j);
			System.out.println(text);
			
		}
		
		
		
		
		
	}
}