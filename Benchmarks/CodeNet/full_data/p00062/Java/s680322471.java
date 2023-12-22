import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out =new PrintWriter(System.out);
		ArrayList<Integer> List =new ArrayList<Integer>();
		ArrayList<Integer> temp=new ArrayList<Integer>();
		while(sc.hasNext()){
			int ans=0;
			char []tmp=sc.nextLine().toCharArray();
			for(int i=0;i<10;i++){
				List.add(Integer.parseInt(""+tmp[i]));
			}
			for(int n=0;n<10;n++){
				for(int i=1;i<List.size();i++){
					temp.add((List.get(i)+List.get(i-1))%10);
				}
				List.clear();
				for(int a:temp){
					List.add(a);
					ans=a;
				}
				temp.clear();
			}
			out.println(ans);

		}
		out.flush();
	}
}