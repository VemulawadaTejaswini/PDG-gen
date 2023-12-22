import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			while(true){
				scan = new Scanner(System.in);
				char[] str = scan.next().toCharArray();
				if(str[0] == '-')break;
				LinkedList<Character> list = new LinkedList<Character>();
				for(int i= 0 ; i < str.length;i++)
					list.add(str[i]);
				int n = scan.nextInt();
				for(int i = 0 ;i < n;i++){
					int data = scan.nextInt();
					for(int j = 0;j < data;j++){
						list.add(list.pop());
					}
				}
				for(Iterator<Character> it = list.iterator();it.hasNext();){
					System.out.print(it.next());
				}
				System.out.println();
			}
		}finally{
			if(scan!=null)scan.close();
		}
	}
}