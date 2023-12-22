import java.util.*;
import java.io.*;

public class Main{
	public static String judge(String[] str){
		int[][] point = new int[4][2];
		int index = 0;
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if( str[i].charAt(j) == '1' ){
					point[index][0] = i;
					point[index][1] = j;
					index++;
				}
			}
		}
		int a = point[3][0]-point[0][0];
		int b = point[3][1]-point[0][1];
		if( a == 1 && b == 1 ){
			return "A";
		} else if( a == 3 && b == 0 ){
			return "B";
		} else if( a == 0 ){
			return "C";
		} else if( a == 2 && b == -1 ){
			return "D";
		} else if( a == 1 && b == 2 ){
			return "E";
		} else if( a == 2 && b == 1 ){
			return "F";
		} else {
			return "G";
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = null;
		List<String> result = new ArrayList<String>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				String[] str = new String[8];
				for(int i = 0; i < 8; i++){
					str[i] = stdIn.next();
				}
				result.add(judge(str));
			}
			for(String str : result){
				System.out.println(str);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}