package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null,tmp = "";
		int tmpa,i,s=0,t;
		System.exit(9);
		while(true){
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			tmpa = Integer.parseInt(tes);
			if(tmpa == 0){
				break;
			}
			char[][] tmpca = new char[tmpa+1][tmpa+1];
			
			for(i=0;i<tmpa;i++){
				try {
					tes = br.readLine();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				tmp += tes;
				tmpca[i] = tes.toCharArray();
			}
			
			
			for(i=0;i<(tmpca.length-1);i++){
				for(int j=0;j<(tmpca[i].length-1);j++){
					
					if(tmpca[i][j] == '.'){
						t = saiki(tmpca,i,j,2);
						if(t > s){
							s = t;
						}
					}
					
					
					
				}
			}
			s--;
			System.out.println(s);
			
		}
		System.exit(0);
		
	}
	
	public static int saiki(char[][] s,int i,int j,int ss){
		int ret = ss;
		boolean tf = true;
		
		if(s.length <= ss){
			return ss;
		}
		
		for(int a=0;a<ss;a++){
			for(int b=0;b<ss;b++){
				if(s[a][b] != '.'){
					tf = false;
					a = ss+1;
					b = ss+1;
				}
			}
		}
		
		
		if(tf){
			ret = saiki(s,i,j,ss+1);
		}
		
		
		
		return ret;
		
	}

}