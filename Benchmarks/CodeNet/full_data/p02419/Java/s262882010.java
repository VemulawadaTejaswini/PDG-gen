import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		//System.out.print(" ");
		Scanner scan = new Scanner(System.in);
		String Ward =scan.nextLine();
		String tem = "";
		int out = 0;
		ArrayList<String> T = new ArrayList<String>();
		while(!tem.equals("END_OF_TEXT")){
			tem = scan.next();
			T.add(tem) ;
		}
		for(int i=0; i<T.size()-1; i++){
			if(T.get(i).equalsIgnoreCase(Ward)){
				out += 1 ;
			}
		}
		System.out.println(out);
	}
}