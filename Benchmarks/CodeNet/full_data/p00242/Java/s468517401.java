import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static HashMap<String,Integer> map=new HashMap<String,Integer>();
	static List<String> list=new LinkedList<String>();
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true){
			int lines=Integer.parseInt(cin.nextLine());
			list=new LinkedList<String>();
			map=new HashMap<String,Integer>();
			if(lines==0)break;
			for(int i=0;i<lines;i++){
				String[] s = cin.nextLine().split(" ");
				for(int j=0;j<s.length;j++){
//					System.out.println(s[j]);
					if(map.containsKey(s[j])){
						map.put(s[j], map.get(s[j])+1);
					}
					else{
						list.add(s[j]);
						map.put(s[j], 1);
					}
				}
			}
			char c = cin.nextLine().charAt(0);
			String ans="";
			List<StInt> ansList=new LinkedList<StInt>();
			for(String s:list){
				if(s.charAt(0)!=c)continue;
				ans=s.toString();
				ansList.add(new StInt(ans,map.get(s)));
			}
			Collections.sort(ansList);
			if(ansList.size()==0){
				System.out.print("NA");
			}
			else{
				int cnt=0;
				for(StInt s:ansList){
					if(cnt!=0){
						System.out.print(" ");
					}
					System.out.print(s.s);//+" "+s.a);
					cnt++;
					if(cnt==5)break;
				}				
			}
			System.out.println();
		}

	}
	static class StInt implements Comparable<StInt>{
		String s;
		int a;
		StInt(String ss,int aa){
			s=ss;
			a=aa;
		}
		@Override
		public int compareTo(StInt o) {
			StInt si=(StInt)o;
			if(this.a!=si.a){
				return -(this.a-si.a);
			}
			return (this.s.compareTo(si.s));
		}
		
	}
}