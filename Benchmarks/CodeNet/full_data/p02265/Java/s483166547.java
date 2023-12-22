import java.util.*;
import java.io.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//Scanner s = new Scanner(System.in);
		//s.nextLine();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> seq = new ArrayList<Integer>();
		String command;
		Integer num = 0;
		//while(s.hasNext()){
		Integer count = Integer.parseInt(br.readLine());
		for(int i = 0; i < count; i++){
			String input = br.readLine();
			String[] input_array = input.split(" ");
			if(input_array.length == 1){
				command = input_array[0];
			}
			else{
				command = input_array[0];
				num = Integer.parseInt(input_array[1]);
			}
			if(command.equals("insert")){
				seq.add(0, num);
			}
			else if(command.equals("delete")){
				seq.remove(num);
			}
			else if(command.equals("deleteFirst")){
				seq.remove(0);
			}
			else if(command.equals("deleteLast")){
				seq.remove(seq.size() - 1);
			}
		}
		//s.close();
		String output = "";
		for(int i = 0; i < seq.size(); i++){
			if(i == seq.size() - 1){
				output = output + seq.get(i);
			}
			else{
				output = output + seq.get(i) + " ";
			}
			if(output.length() > 1000){
				System.out.print(output);
				output = "";
			}
		}
		System.out.println(output);

	}
}