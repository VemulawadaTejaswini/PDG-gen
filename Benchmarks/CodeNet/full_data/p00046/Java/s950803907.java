package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;

		ArrayList<Double> al = new ArrayList();
		try {
			tes = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		double a = Double.parseDouble(tes);
		al.add(a);
		
		while(true){
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			try{
				a = Double.parseDouble(tes);
			}catch(NumberFormatException e){
				break;
			}
			
			
			al.add(a);
		}
		
		for(int i=0;i<al.size();i++){
			for(int j=i+1;j<al.size();j++){
				if(al.get(i) < al.get(j)){
					double tmp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, tmp);
				}
			}
		}
		System.out.println(al.get(0) - al.get(al.size() - 1));
		
		
	}

}