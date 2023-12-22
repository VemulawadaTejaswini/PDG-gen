import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String[] strInputList;
		List<Integer>intListDivisorsC= new ArrayList<Integer>();
		List<Integer>intListAtoC = new ArrayList<Integer>();
		List<Integer>intListResultDivisors = new ArrayList<Integer>();
		int intResult = 0;
		
		String strINputNum = br.readLine();
		strInputList = strINputNum.split(" ");
		
		int intNumA = Integer.parseInt(strInputList[0]);
		int intNumB = Integer.parseInt(strInputList[1]);
		int intNumC = Integer.parseInt(strInputList[2]);
		
		for(int i = 1; i <= intNumC; i++){
			int j= intNumC % i;
			if(j == 0) {
				intListDivisorsC.add(i);
			}else {				
			}
		}
		
		for(int i = intNumA; i <= intNumB; i++) {
			if(i <= intNumB) {
				intListAtoC.add(i);
			}
		}
		
		for(int i = 0; i < intListDivisorsC.size(); i++) {
			for(int j = 0; j < intListAtoC.size(); j++) {
				int intDivisorsC = intListDivisorsC.get(i);
				int intAtoC = intListAtoC.get(j);
				if(intDivisorsC == intAtoC) {
					intListResultDivisors.add(intAtoC);
				}
			}
		}
		intResult = intListResultDivisors.size();
		System.out.println(intResult);
	}
}
