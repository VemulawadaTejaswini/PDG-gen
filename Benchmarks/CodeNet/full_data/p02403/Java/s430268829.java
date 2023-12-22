package jp.co.ws.training.aizuonline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputData;
        List<Square> squareList = new ArrayList<Square>();
        try {
        	//??\???
	        while(true){
				inputData = reader.readLine();
	            if("0 0".equals(inputData)){
	            	break;
	            }else{
					String[] strNumber = inputData.split(" ");
					int h = Integer.parseInt(strNumber[0]);
					int w = Integer.parseInt(strNumber[1]);
					squareList.add(new Square(h,w));
	            }
	        }

	        //??????
	        for(Square square : squareList){
				outputSquare(square.h , square.w);
				System.out.println();
	        }

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	/**
	 * ????????¢?????????
	 * @param h
	 * @param w
	 */
	private static void outputSquare(int h, int w) {
		StringBuilder sbLine = new StringBuilder();
		for(int i=0;i< w ;i++){
			sbLine.append("#");
		}
		for(int i=0;i<h;i++){
			System.out.println(sbLine.toString());
		}
	}

}

class Square{

	public int h;
	public int w;

	Square(int _h ,int _w){
		h = _h;
		w = _w;
	}
}