import java.io.*;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		Integer num = Integer.parseInt(s.nextLine());
		String[] input = s.nextLine().split(" ");
		Integer[] seq = new Integer[num];
		for(int i = 0; i < num; i++){
			seq[i] = Integer.parseInt(input[i]);
		}
		s.close();
		for(int j = 1;j < seq.length; j++){
			print_seq(seq);
			Integer key = seq[j];
			Integer i = j - 1;
			while(i >= 0 && seq[i] > key){
				Integer bkp = seq[i+1];
				seq[i+1] = seq[i];
				seq[i] = bkp;
				i -= 1;
			}
		}
		print_seq(seq);
	}

	private static void print_seq(Integer[] seq){
		for(int i = 0; i < seq.length; i++){
			if(i == seq.length - 1){
				System.out.print(seq[i]);
			}
			System.out.print(seq[i] + " ");
		}
		System.out.print("\n");
	}
}