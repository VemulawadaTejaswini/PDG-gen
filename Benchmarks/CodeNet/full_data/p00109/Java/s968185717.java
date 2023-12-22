import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> ans = new ArrayList<Integer>();
		String line = in.readLine();

		int size = Integer.parseInt(line);

		for(int n=0; n<size; n++){
			line = in.readLine();
			int a = SC(line);
			ans.add(a);
		}

		for(int i=0; i<ans.size(); i++){
			System.out.println(ans.get(i));
		}
	}

	public int SC(String line){
		List<String> eq = new ArrayList<String>();
		int count = 0;
		while(true){
			String str = line.substring(count, count+1);
			if(str.equals("=")){
				break;
			}
			eq.add(str);
			count++;
		}

		count = 0;
		while(count < eq.size()-1){
			if(isNumber(eq.get(count)) && isNumber(eq.get(count+1))){
				String dst = eq.get(count) + eq.get(count+1);
				eq.add(count+2, dst);
				eq.remove(count);
				eq.remove(count);
			}
			else{
				count++;
			}
		}


		while(eq.size() != 1){
			//ツ環古環づ個計ツ算
			int m;
			int bra_count = 0;
			int n = eq.indexOf("(");
			if(n != -1){
				for(int i=n+1; i<eq.size(); i++){
					if(eq.get(i).equals(")") && bra_count == 0){
						eq = RangeReplace(eq, n, i);
						break;
					}
					else if(eq.get(i).equals("(")){
						bra_count++;
					}
					else if(eq.get(i).equals(")")){
						bra_count--;
					}
				}

				continue;
			}

			//ツ掛ツつッツ算ツ環づィツ算
			n = eq.indexOf("*");
			m = eq.indexOf("/");

			if(n != -1 && (m == -1 || n < m)){
				int a = Integer.parseInt(eq.get(n-1)) * Integer.parseInt(eq.get(n+1));
				eq.add(n+2, Integer.toString(a));
				eq.remove(n-1);
				eq.remove(n-1);
				eq.remove(n-1);
				continue;
			}

			if(m != -1 && (n == -1 || m < n)){
				int a = Integer.parseInt(eq.get(m-1)) / Integer.parseInt(eq.get(m+1));
				eq.add(m+2, Integer.toString(a));
				eq.remove(m-1);
				eq.remove(m-1);
				eq.remove(m-1);
				continue;
			}

			//ツ堕ォツつオツ算ツ暗クツつォツ算
			n = eq.indexOf("+");
			m = eq.indexOf("-");

			if(n != -1 && (m == -1 || n < m)){
				int a = Integer.parseInt(eq.get(n-1)) + Integer.parseInt(eq.get(n+1));
				eq.add(n+2, Integer.toString(a));
				eq.remove(n-1);
				eq.remove(n-1);
				eq.remove(n-1);
				continue;
			}

			if(m != -1 && (n == -1 || m < n)){
				int a = Integer.parseInt(eq.get(m-1)) - Integer.parseInt(eq.get(m+1));
				eq.add(m+2, Integer.toString(a));
				eq.remove(m-1);
				eq.remove(m-1);
				eq.remove(m-1);
				continue;
			}
		}

		return Integer.parseInt(eq.get(0));
	}

	public List<String> RangeReplace(List<String> eq, int s, int e){
		String part = "";

		for(int i=s+1; i<e; i++){
			part += eq.get(i);
		}

		part = Integer.toString(SC(part+"="));

		eq.add(e+1, part);

		for(int i=s; i<=e; i++){
			eq.remove(s);
		}

		return eq;
	}

	public boolean isNumber(String s){
		try{
			int n = Integer.parseInt(s);
		}catch(NumberFormatException err){
			return false;
		}

		return true;
	}
}