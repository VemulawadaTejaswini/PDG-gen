import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){
		//出席者の出席番号を、昇順に取得
		Scanner stdIn = new Scanner(System.in);
		int[] attendanceNumbers = new int[28];
		for(int i=0;i<28;i++)attendanceNumbers[i] = stdIn.nextInt();
		Arrays.sort(attendanceNumbers);
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=1;i<=30;i++)array.add(i);
		for(int i:attendanceNumbers)array.remove(i);
		for(int i:attendanceNumbers)System.out.println(i);
		
	}
}