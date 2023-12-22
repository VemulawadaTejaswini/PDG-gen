import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Data> list = new ArrayList<Data>();
		int i=0;
		while(true){
			String str=sc.next();
			String[] d=str.split(",");
			int ids=Integer.parseInt(d[0]);
			int anss=Integer.parseInt(d[1]);
			if(ids+anss==0)break;
			list.add(new Data(ids, anss));
			i++;
		}
		Collections.sort(list);
//		for(int j=0;j<i;j++){
//			System.out.println(list.get(j).id+" "+list.get(j).ans);
//		}
		while(sc.hasNext()){
			int num=sc.nextInt();
//			System.out.println(list.get(num).id);
			int cnt=1;
			for(int k=1;k<i;k++){
				if(list.get(k-1).ans==list.get(num).ans)break;
				if(list.get(k-1).ans!=list.get(k).ans){
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
	static class Data implements Comparable<Data>{
		int id;
		int ans;
		public Data(int id, int ans) {
			this.id=id;
			this.ans=ans;
		}
		public int compareTo(Data o) {
			if(this.ans>o.ans)return -1;
			else if(this.ans<o.ans)return 1;
			return 0;
		}
	}
}