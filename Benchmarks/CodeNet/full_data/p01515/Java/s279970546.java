import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	static int p,t,r;
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			t=sc.nextInt();
			p=sc.nextInt();
			r=sc.nextInt();
			if(t+p+r==0)break;
		
			
			ArrayList<Data>list=new ArrayList<Data>();//listに入れる処理をしなきゃね			
			for(int i=0;i<t;i++){
				list.add(new Data(i+1));
			}
			for(int i=0;i<r;i++){
				int teams=sc.nextInt()-1;
				int number=sc.nextInt();
				int pena=sc.nextInt();
				String mes=sc.next();
				list.get(teams).solve(number, pena, mes);
			}
			Collections.sort(list);
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
			}
		}
	}
	static class Data implements Comparable<Data>{
		int team,ans,pena;
		int wrong[];boolean t[];
		public Data(int id){
			this.team=id;
			this.ans=0;
			this.pena=0;
			wrong=new int[p+1];
			t=new boolean[p+1];
		}
		void solve(int problem,int time,String message){//提出したときの処理
			if(message.equals("CORRECT")){
				if(t[problem])return;
				ans++;
				pena+=time+wrong[problem]*1200;
				t[problem]=true;
			}else{
				wrong[problem]++;
			}
		}
		@Override
		public int compareTo(Data o) {
			if(this.ans<o.ans){
				return 1;
			}else if(this.ans>o.ans){
				return -1;
			}else if(this.pena>o.pena){
				return 1;
			}else if(this.pena<o.pena){
				return -1;
			}else if(this.team>o.team){
				return 1;
			}else if(this.team<o.team){
				return-1;
			}return 0;
		}
		public String toString(){
			return this.team+" "+this.ans+" "+this.pena;
		}
	}
}