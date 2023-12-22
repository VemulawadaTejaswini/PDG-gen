package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class aoj031 {
	public static void main(String[] args){
		BigDecimal one = new BigDecimal("1.00");
		int[] abo = {0,0,0,0};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int cup = 0;
		int mun = 0;
		int ter = 0;
		String[] rrr;
		int st = 0,sr = 0;
		double mon = 0;
		int syo=0,hisi=0;
		double aaaa = 1;
		
		int zixtusi = 0;
		int touri = 0;
		int i = 0;
		
		ArrayList<Integer> fas = new ArrayList<Integer>();
		ArrayList<Integer> has = new ArrayList<Integer>();
		ArrayList<Integer> las = new ArrayList<Integer>();
		
		while(true){
			
			while(true){
				try {
					tmp = br.readLine();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				
				if(tmp.equals("")){
					break;
				}
				
				String[] sprit = tmp.split(",",0);
				
				fas.add(Integer.parseInt(sprit[0]));
			}
			
			
			while(true){
				try {
					tmp = br.readLine();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				
				if(tmp.equals("")){
					break;
				}
				
				String[] sprit = tmp.split(",",0);
				
				has.add(Integer.parseInt(sprit[0]));
			}
			
			for(i=0;i<fas.size();i++){
				for(int j=0;j<has.size();j++){
					
					if(fas.get(i) == has.get(j)){
						int k = 0;
						for(k=0;k<las.size();k++){
							if(las.get(k) == fas.get(i)){
								k = 1000000;
								break;
							}
						}
						if(k != 1000000){
							las.add(fas.get(i));
						}
					}
					
				}
			}
			
			Collections.sort(las);
			
			
			int[] las2 = new int[las.size()];
			
			for(i=0;i<fas.size();i++){
				for(int j=0;j<las.size();j++){
					
					if(fas.get(i) == las.get(j)){
						las2[j]++;
					}
				}
			}
			
			for(i=0;i<has.size();i++){
				for(int j=0;j<las.size();j++){
					
					if(has.get(i) == las.get(j)){
						las2[j]++;
					}
				}
			}
			
			for(i=0;i<las.size();i++){
				System.out.println(las.get(i)+" "+las2[i]);
			}
			
			
		}
		
	}

}