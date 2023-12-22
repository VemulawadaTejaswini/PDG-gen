import java.io.*;
import java.util.*;


public class Main {
	static ArrayList<String> cand = new ArrayList<String>();
	static int max = 0;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
		try {
			String line;
			while(true){
				/* input */
				line = br.readLine();
				
				int c = Integer.parseInt(line);
				
				for(int n=0;n<c;n++){
					int p = Integer.parseInt(br.readLine());
					int year = Integer.parseInt(br.readLine());
					int m = Integer.parseInt(br.readLine());
					
					int amount = 0; 
					
					for(int i=0;i<m;i++){
						line = br.readLine();
						int sc = Integer.parseInt(line.split(" ")[0]);
						double rate = Double.parseDouble(line.split(" ")[1]);
						int charge = Integer.parseInt(line.split(" ")[2]);
						
						int balance = p;
						
						switch(sc){
						case 0:
						double after = balance;
						int ci = 0;
						for(int j=0;j<year;j++){
								after = balance * (rate);
								ci += (int)Math.floor(after);
								balance -= charge;
						}
						//System.out.println(balance+ci);
						if(ci+balance>amount) amount = ci+balance;
						break;
						case 1:
						double afterc = balance;
						for(int j=0;j<year;j++){
							afterc = balance * (1.0+rate);
								balance = (int)Math.floor(afterc) - charge;
						}
						//System.out.println("c: " + balance);
						if(balance>amount) amount = balance;
						break;
						}
					}
					/* output */

					System.out.println(amount);
					
				}

				/* processing */

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void search(int i,int j,char[][] field,int h,int w, String s){
		boolean r = true, d = true;
		if(j<w-1){
			if(Character.isDigit(field[i][j+1])){
				search(i,j+1,field,h,w,s + field[i][j+1]);
				r = false;
			}
		}
		
		if(i<h-1){
			if(Character.isDigit(field[i+1][j])){
				search(i+1,j,field,h,w,s + field[i+1][j]);
				d = false;
			}
		}
		if(r&&d){
			if(s.length()>max) max = s.length();
			cand.add(s);
		}
	}
}