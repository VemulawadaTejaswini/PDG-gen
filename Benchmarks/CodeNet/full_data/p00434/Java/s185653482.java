import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] attendanceNumbers = new int[28];
		for(int i:attendanceNumbers)attendanceNumbers[i] = stdIn.nextInt();
		Arrays.sort(attendanceNumbers);
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int j=1;j<=30;j++)array.add(j);
		for(int k:attendanceNumbers)array.remove(k);
		for(int l:attendanceNumbers)System.out.println(l);
	}
}