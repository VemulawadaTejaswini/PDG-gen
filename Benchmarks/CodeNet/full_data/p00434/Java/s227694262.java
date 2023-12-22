import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] attendanceNumbers = new int[28];
		for(int i:attendanceNumbers)attendanceNumbers[i] = stdIn.nextInt();
		Arrays.sort(attendanceNumbers);
		
		for(int j=0;j<28;j++){
			if(attendanceNumbers[j]!=(j+1)){
				System.out.println(attendanceNumbers[j]); 
				j++;
			}
		}
	}
}