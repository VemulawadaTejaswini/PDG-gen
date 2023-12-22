import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(
			new InputStreamReader(System.in));
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		String l[];
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
			l=br.readLine().split(" ");
			String c=l[0];
			switch(c){
				case "insert":ad.addFirst(Integer.parseInt(l[1]));break;
				case "delete":ad.remove(Integer.parseInt(l[1]));break;
				case "deleteFirst":ad.removeFirst();break;
				case "deleteLast":ad.removeLast();break;
			}
		}
		StringBuilder sb=new StringBuilder();
		sb.append(ad.poll());
		for(int t:ad)sb.append(" ").append(t);
		sb.append("\n");
		System.out.println(sb);
	}
}