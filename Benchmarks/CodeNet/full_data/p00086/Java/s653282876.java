import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = null;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
			while( stdIn.hasNext() ){
				int n = stdIn.nextInt(), m = stdIn.nextInt();
				Map<String, Integer> road = new HashMap<String, Integer>();
				while( n != 0 || m != 0 ){
					road.put(Integer.toString(n), (road.get(Integer.toString(n)) == null) ? 1 : road.get(Integer.toString(n))+1);
					road.put(Integer.toString(m), (road.get(Integer.toString(m)) == null) ? 1 : road.get(Integer.toString(m))+1);
					n = stdIn.nextInt();
					m = stdIn.nextInt();
				}
				if( road.get("1") == 1 ){
					road.put("1", 0);
				}
				if( road.get("2") == 1 ){
					road.put("2", 0);
				}
				boolean flag = true;
				for(String s : road.keySet()){
					if( road.get(s)%2 != 0 ){
						flag = false;
					}
				}
				if( flag ){
					System.out.println("OK");
				} else {
					System.out.println("NG");
				}
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}