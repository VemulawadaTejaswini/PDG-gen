import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			LinkedList<Integer> ll = new LinkedList<Integer>();

			for(int i=0; i<n; i++){
				String com = br.readLine();
				if(com.equals("deleteFirst")){
					ll.removeFirst();
				} else if(com.equals("deleteLast")){
					ll.removeLast();
				} else{
					String com_data[] = com.split(" ", 0);
					if(com_data[0].equals("insert")){
						ll.addFirst(Integer.parseInt(""+com_data[1]));
					} else if(com_data[0].equals("delete")){
						Iterator<Integer> it = ll.iterator();
						while(it.hasNext()){
							if((int)it.next()==Integer.parseInt(""+com_data[1])){
								it.remove();
								break;
							}
						}
					}
				}
			}

			Iterator<Integer> it = ll.iterator();
			int i=0;
			while(it.hasNext()){
				if(i==0) System.out.print((int)it.next());
				else     System.out.print(" "+(int)it.next());
				i=1;
			}
			System.out.println();
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
	}
}