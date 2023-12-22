import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Date from = new Date();
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < n; i++){
			String[] strArray = br.readLine().split(" ");
			String inst = strArray[0];

			if(inst.equals("insert")){
				list.addFirst(Integer.parseInt(strArray[1]));
			}
			else if(inst.equals("delete")){
				list.removeFirstOccurrence(Integer.parseInt(strArray[1]));
			}
			else if(inst.equals("deleteFirst")){
				list.poll();
			}
			else if(inst.equals("deleteLast")){
				list.removeLast();
			}
			//System.out.println("i = " + i);
			//printList(list);

		}
		Date to = new Date();

		//System.out.println("Instruction Done "+(to.getTime() - from.getTime()) + " milli sec");
		printList(list);
	}

	static void printList(LinkedList list){

		Date from = new Date();
		int j = 0;
		StringBuffer sb = new StringBuffer();
		ListIterator<Integer> it = list.listIterator();
		for(int i = 0; i < list.size() ; i++){
			//list.get(i);

			int tmp = it.next();
			/*
			System.out.print(tmp);
			if(i != list.size() - 1){
				System.out.print(" ");
			}
			*/

			/*
			System.out.print(list.get(i));
			if(i != list.size() - 1){
				System.out.print(" ");
			}
			*/


			sb.append(String.valueOf(tmp));
			if(i != list.size() - 1){
				sb.append(" ");
			}

		}

		System.out.println(sb.toString());
		Date to = new Date();
		//System.out.println("it takes"+(to.getTime() - from.getTime()));
	}

}