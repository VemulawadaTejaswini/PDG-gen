import java.io.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(reader.readLine());
	ArrayList<Integer> list = new ArrayList<Integer>();
	String[] input;
	String commnad;
	for (int i = 0; i < n; i++) {
	    input  = reader.readLine().split(" ");
	    command = input[0];
	    switch (command) {
	    case "insert":
		list.add(0, Integer.parseInt(input[1]));
		break;
	    case "delete":
		int index = list.indexOf(Integer.parseInt(input[1]));
		if(index != -1){
		    list.remove(index);
		}
		break;
	    case "deleteFirst":
		list.remove(0);
		break;
	    case "deleteLast":
		list.remove(list.size() - 1);
		break;
	    }
	}
	for (int i = 0; i < list.size() - 1; i++) {
	    System.out.print(list.get(i) + " ");
	}
	System.out.println(list.get(list.size() - 1));
    }
}