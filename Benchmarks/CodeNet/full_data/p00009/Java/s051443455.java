import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class Prime {
	
	public static void main(String[] args) {
	
		File inFile = new File(args[0]);
		Scanner datasets;
		try {
			datasets = new Scanner(inFile);
			
			
			datasets.close();
		} catch (FileNotFoundException e) {
			System.out.print("not found");
		}
	}
}