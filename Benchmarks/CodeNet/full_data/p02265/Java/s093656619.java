import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int x=Integer.parseInt(br.readLine());
		ArrayDeque<Integer> list=new ArrayDeque<Integer>();
		for (int i = 0; i < x; i++) {
			String s=br.readLine();
			String[] v=s.split(" ");
			if(v[0].equals("insert")){
				int val=Integer.parseInt(v[1]);
				list.addFirst(val);
			}else if(v[0].equals("delete")){
				int val=Integer.parseInt(v[1]);
				list.remove(val);
				
			}else if(v[0].equals("deleteFirst")){
				list.removeFirst();
				
			}else if(v[0].equals("deleteLast")){
				list.removeLast();
			}
		}
		int size=list.size();
		int i=0;
		for (Integer integer : list) {
			System.out.print(integer);
			if(i<size-1)
				System.out.print(" ");
			i++;
		}
		System.out.println();

	}

}