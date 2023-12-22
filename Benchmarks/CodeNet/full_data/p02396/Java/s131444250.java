import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		String[] Array = line.split("\n");
		int[] numArray = new int[Array.length];
		for(int i = 0; i<Array.length ; i++){
			numArray[i] = Integer.parseInt(Array[i]);
		}
		for(int j = 0; j<numArray.length; j++){
			System.out.println("Case"+j+":"+" "+numArray[j]);
		}
	}
}