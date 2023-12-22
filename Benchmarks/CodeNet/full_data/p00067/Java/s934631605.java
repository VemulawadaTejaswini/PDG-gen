package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class aoj06 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		int g=0;
		int d = 0;


		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<ArrayList> al2 = new ArrayList<ArrayList>();
		ArrayList<Integer> lsf = new ArrayList<Integer>();
		ArrayList<Integer> lsl = new ArrayList<Integer>();
		ArrayList<Integer> lsn = new ArrayList<Integer>();
		ArrayList<Integer> lsf2 = new ArrayList<Integer>();
		ArrayList<Integer> lsl2 = new ArrayList<Integer>();
		ArrayList<Integer> lsn2 = new ArrayList<Integer>();
		ArrayList<Integer> dead = new ArrayList<Integer>();

		while(true){
			ArrayList<Integer> al3 = new ArrayList<Integer>();
			for(int s=0;s<12;s++){
				try {
					tes = br.readLine();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				if(tes == null){
					if(g == 1){
						d = 1;
						break;
					}
					g = 1;
					continue;
				}
				if(tes.equals("")){
					if(g == 1){
						d = 1;
						break;
					}
					g = 1;
					continue;
				}
				g = 0;
				try{
					
					for(int i=0;i<12;i++){
						al3.add(Integer.parseInt(String.valueOf(tes.charAt(i))));
						dead.add(0);
					}
				}catch(NumberFormatException e){
					break;
				}
			}
			if(d == 1){
				break;
			}
			al2.add(al3);

			//al.add(a);
		}
	}

}