import java.io.*;
import java.util.ArrayDeque;

public class Main{
	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		ArrayDeque<Integer> place=new ArrayDeque<Integer>();
		ArrayDeque<lake> l=new ArrayDeque<lake>();
		char[] c=br.readLine().toCharArray();
		int totalarea=0;
		for (int i=0;i<c.length;i++){
			if (c[i]=='\\'){
				place.push(i);			
			}else if (c[i]=='/'){
				if (!place.isEmpty()){
					int b=place.pop();
					int a=i-b;
					totalarea+=a;
					while (!l.isEmpty() && l.getFirst().getnum()>b){
						a+=l.getFirst().getarea();
						l.pop();
					}
					l.push(new lake(a,i));
					
				}
			}
		}
		pw.println(totalarea);
		pw.print(l.size());
		for (;!l.isEmpty();){
			pw.print(" "+l.getLast().getarea());
			l.removeLast();
		}
		pw.println();
		pw.close();
	}
}

class lake{
	private int area,num;
	public lake(int a,int i){
		this.area=a;
		this.num=i;
	}
	public int getarea(){
		return this.area;
	}
	public int getnum(){
		return this.num;
	}
}