
import java.io.*;
import java.util.*;


class ProgrammingTestDataSet{
	int[] score;
	ProgrammingTestDataSet(int numPersons){
		score = new int[numPersons];
	}
	public void readScore(Scanner scan){
		for(int i=0; i < score.length; i++)
			this.score[i] = scan.nextInt();
	}
	public double StandardDeviation(){
		double mean = calcMean();
		double result = 0.0;
		for(int i=0; i<score.length; i++)
			result += Math.pow(score[i] - mean, 2);
		result /= score.length;
		return Math.pow(result, 0.5);
	}
	double calcMean(){
		double result = 0.0;
		for(int i=0; i<score.length; i++)
			result += score[i];
		return result /= score.length;
	}
}
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int scannedInt;
		while(true){
			scannedInt = scan.nextInt();
			if(scannedInt==0)
				return;
			ProgrammingTestDataSet dataset = new ProgrammingTestDataSet(scannedInt);
			dataset.readScore(scan);
			System.out.println(dataset.StandardDeviation());
			scan.nextLine();
		}
	}
}