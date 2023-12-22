

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{

			String[] strLine = insBR.readLine().split(" ");
			List<Double> list = new ArrayList<Double>();
			for(int i = 0; i < strLine.length; i++){
				list.add(Double.parseDouble(strLine[i]));
			}
			double dbX = list.get(2) - list.get(0);
			double dbY = list.get(3) - list.get(1);
			double dbPowXY = dbX * dbX + dbY * dbY;
			double dbXY = Math.sqrt(dbPowXY);
			String strXY = String.format("%1$.5f", dbXY);
			System.out.println(strXY);

		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}

	}

}

