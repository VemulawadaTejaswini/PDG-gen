import java.io.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		ArrayList<Integer> list=new ArrayList<Integer>();
		int n=Integer.parseInt(br.readLine());
		for (int i=0;i<n;i++){
			String[] stmp=br.readLine().split(" ");
			switch (stmp[0]){
			case "insert":
				list.add(0,Integer.parseInt(stmp[1]));
				break;
			case "delete":
				list.remove((Integer)Integer.parseInt(stmp[1]));
				break;
			case "deleteFirst":
				list.remove(0);
				break;
			case "deleteLast":
				list.remove(list.size()-1);
				break;
			default: break;
			}
		}
		if (!list.isEmpty()) pw.print(list.get(0));
		for (int i=1;i<list.size();i++){
			pw.print(" "+list.get(i));
		}
		pw.println();
		pw.close();
	}
}