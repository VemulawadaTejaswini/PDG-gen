import java.util.*;
import java.io.*;

public class Main{
	public static double solve(List<String> list){
		int i = 2;
		for(; i < list.size(); i++){
			if( list.get(i).equals("+") || list.get(i).equals("-") || list.get(i).equals("*") || list.get(i).equals("/")){
				double x;
				if( list.get(i).equals("+") ){
					x = Double.parseDouble(list.get(i-2)) + Double.parseDouble(list.get(i-1));
				} else if( list.get(i).equals("-") ){
					x = Double.parseDouble(list.get(i-2)) - Double.parseDouble(list.get(i-1));
				} else if( list.get(i).equals("*") ){
					x = Double.parseDouble(list.get(i-2)) * Double.parseDouble(list.get(i-1));
				} else {
					x = Double.parseDouble(list.get(i-2)) / Double.parseDouble(list.get(i-1));
				}
				list.remove(i); list.remove(i-1); list.remove(i-2);
				list.add(i-2, Double.toString(x));
				i = 1;
			}
		}
		return Double.parseDouble(list.get(0));
	}
			
	public static void main(String[] args){
		Scanner stdIn = null;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));		
			while( stdIn.hasNext() ){
				String[] s = stdIn.nextLine().split(" ");
				List<String> express = new LinkedList<String>();
				for(String str : s){
					express.add(str);
				}
				System.out.printf("%.6f%n", solve(express));		
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}