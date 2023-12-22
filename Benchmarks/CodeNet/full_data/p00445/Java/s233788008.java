import java.util.*;

class Main {


	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String s = in.nextLine();
			int joi = 0, ioi = 0;
			for(int i=0; i<s.length()-2; i++)if(s.substring(i, i+3).equals("JOI")) joi++;
			for(int i=0; i<s.length()-2; i++)if(s.substring(i, i+3).equals("IOI")) ioi++;
			System.out.println(joi);
			System.out.println(ioi);
		}
	}

}