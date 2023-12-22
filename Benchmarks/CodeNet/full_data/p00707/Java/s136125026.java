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
				cand = new ArrayList<String>();
				line = br.readLine();
				
				int w = Integer.parseInt(line.split(" ")[0]);
				int h = Integer.parseInt(line.split(" ")[1]);
				if(w == 0 && h == 0){
					return;
				} 

				char[][] field = new char[h][w];
				for(int i=0;i<h;i++){
					line = br.readLine();
					for(int j=0;j<w;j++){
						field[i][j] = line.charAt(j);
					}
				}
				/* processing */
				for(int i=0;i<h;i++){
					for(int j=0;j<w;j++){
						if((h-i)+(w-j)<max){
							continue;
						}
						if(i>0){
							if(Character.isDigit(field[i-1][j])&&(field[i-1][j]!='0')){
								continue;
							}
						}
						if(j>0){
							if(Character.isDigit(field[i][j-1])&&(field[i][j-1]!='0')){
								continue;
							}
						}
						if(Character.isDigit(field[i][j])&&(field[i][j]!='0')){
								search(i,j,field,h,w,""+field[i][j]);
						}
					}
				}

				/* output */
				Collections.sort(cand);
				int maxlength = 0;
				String maxs = "";
				for(String s: cand){
					//System.out.println(s);
					if (s.length()>maxlength){
						maxlength = s.length();
						maxs = s;
					} else if(s.length()==maxlength){
						for(int i=0;i<s.length();i++){
							if(s.charAt(i)>maxs.charAt(i)){
								maxs = s;
							} else if(s.charAt(i)>maxs.charAt(i)){
								continue;
							}
						}
					}
					//System.out.println();
				}
				
				System.out.println(maxs);
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