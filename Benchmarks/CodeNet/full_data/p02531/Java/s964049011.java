import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner (new InputStreamReader(System.in));
			LinkedList<String> list = new LinkedList<String>();
			while(scan.hasNext()){
				String[] str = scan.nextLine().split(" ");
				if(str[0].equals("quit"))break;
				if(str[0].equals("push")){
					list.push(str[1]);
				}else if( str[0].equals("pop")){
					System.out.println(list.pop());
				}
			}
		}finally{
			scan.close();
		}
	}
}