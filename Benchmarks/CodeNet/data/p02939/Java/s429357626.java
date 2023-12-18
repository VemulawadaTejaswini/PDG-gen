import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.plaf.synth.SynthProgressBarUI;

public class Main {

	static BufferedReader reader;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		String s = readLine()[0];
		char[] cs = s.toCharArray();
		ArrayList<String> css = new ArrayList<String>();
		StringBuilder now = new StringBuilder();
		css.add(new StringBuilder().append(cs[0]).toString());
		for(int ci = 1; ci<cs.length; ci++) {
			now.append(cs[ci]);
			if(!css.get(css.size()-1).equals(now.toString())) {
				css.add(now.toString());
				now = new StringBuilder();
			}
		}
		print(css.size());
		
		/*
		for(int N = cs.length; N>=1; N--) {
			int[][] cc = getCombinations(cs.length,N);
			for(int i=0;i<cc.length;i++) {
				ArrayList<String> ss = divArrayToArrayLength(cs,cc[i]);
				if(isOK(ss)) {
					print(N);
					return;
				}
			}
		}*/
	}
	
	//functions here
	//note that all methods should be STATIC
	private static ArrayList<String> divArrayToArrayLength(char[] cs, int[] lengths){
		ArrayList<String> res = new ArrayList<String>();
		int ci = 0;
		for(int li = 0; li<lengths.length;li++) {
			StringBuilder sb = new StringBuilder();
			for(int ccount=0;ccount<lengths[li];ccount++) {
				sb.append(cs[ci++]);
			}
			res.add(sb.toString());
		}
		return res;
	}
	
	private static int[][] getCombinations(int all, int section) {
		if(all<section) {return new int[0][0];}
		if(section==1) {return new int[][] {{all}};}
		ArrayList<Integer[]> is = new ArrayList<>();
		for(int k=1;k<=all-section+1;k++) {
			int[][] isl = getCombinations(all-k,section-1);
			for(int j=0;j<isl.length;j++) {
				Integer[] ist = new Integer[section];
				ist[0] = k;
				for(int i=0;i<isl[j].length;i++) {
					ist[i+1] = isl[j][i];
				}
				is.add(ist);
			}
		}
		int[][] res = new int[is.size()][section];
		for(int i=0;i<is.size();i++) {
			for(int j=0;j<section;j++) {
				res[i][j] = is.get(i)[j];
			}
		}
		return res;
	}
	private static boolean isOK(ArrayList<String> ss) {
		for(int i=0;i<ss.size()-1;i++) {
			if(ss.get(i).equals(ss.get(i+1))) {
				return false;
			}
		}
		return true;
	}
	
	private static int isIn(Object needle, Object[] heystack) {
		for(int i=0;i<heystack.length;i++) {
			if(needle.equals(heystack[i])) {
				return i;
			}
		}
		return -1;
	}
	
	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}

	private static int[] readLineInt(){
		try{
			String[] s = readLine();
			int[] ints = new int[s.length];
			for(int i=0;i<ints.length;i++) {
				ints[i] = Integer.parseInt(s[i]);
			}
			return ints;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
}