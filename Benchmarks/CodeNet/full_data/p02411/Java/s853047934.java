//import java.util.ArrayList;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
import java.io.*;
import java.util.*;

class Grading {

	ArrayList<int[]> _testdata;
	
	public static void main(String[] args) {
		Grading test = new Grading();
		test.run();
	}
	
	public Grading(){
		_testdata = new ArrayList<int[]>();
	}
	
	void run(){
		inputData();
		printTestdata();
	}
	
	//Data????¨??????\???????????\?????????
	private void inputData(){
		BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
		
		do {
			int[] linedata;
			try{
				linedata = changeTestdata(buf.readLine());
			}catch(IOException e){
				System.err.println(e.toString());
				System.err.println("Input Error");
				continue;
			}
			
			if (checkInputDataLast(linedata)) break;
			_testdata.add(linedata);
			
		}while(true);
	}
	
	private int[] changeTestdata(String line){
		String[] sdata = line.split(" ");
		
		int[] data = new int[sdata.length];
		for (int i = 0; i < sdata.length; i++){
			try {
				data[i] = Integer.parseInt(sdata[i]);
			}catch(NumberFormatException e){
				data[i] = -2;
			}
		}
		
		return data;
	}
	
	private boolean checkInputDataLast(int[] data){
		if (data.length != 3) return false;
		return (data[0] == -1 &&data[1] == -1 &&data[2] == -1) ;
	}
	private void printTestdata() {
		for (int i = 0; i < _testdata.size() ;i++){
			int[] t = _testdata.get(i);
			System.out.println(judgeData(t));
		}
	}
	
	
	private char judgeData(int[] test){
		if (test.length < 2) return 'F';
		if (test[0] == -1 || test[1] == -1) return 'F';
		if (test[0] + test[1] >= 80) return'A';
		if (test[0] + test[1] >= 65) return 'B';
		if (test[0] + test[1] >= 50) return 'C';
		if (test[0] + test[1] >= 30){
			if (test[2] >= 50) return 'C';
			else return 'D';
		}
		
		return 'F';
	}
}