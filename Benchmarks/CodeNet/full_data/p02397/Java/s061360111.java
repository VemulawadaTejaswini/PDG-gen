import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		List<Integer>intList = new ArrayList<Integer>();
		String[] strList;
		
		do {
			String strINputNum = br.readLine();
			strList = strINputNum.split(" ");
			
			int intNumX = Integer.parseInt(strList[0]);
			int intNumY = Integer.parseInt(strList[1]);
			
			intList.add(intNumX);
			intList.add(intNumY);
			
		}while(!(strList[0].equals("0") && strList[1].equals("0")));
		
		 int intEndCount = intList.size()-2;
		
		for(int i = 0; i < intEndCount; i = i + 2) {
			int intX= intList.get(i);
			int intY= intList.get(i +1);
			
			if(intX < intY) {
				System.out.println(intX + " " + intY);
			}else {
				System.out.println(intY + " " + intX);
			}
		}
	}
}
