
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0571().doIt();
	}


	class AOJ0571{
		void doIt(){
			char[] input = in.next().toCharArray();
			int result = 0;
			int n = input.length;
			int cnt = 0;
			ArrayList<Data> list = new ArrayList<Data>();
			for(int i=1;i<n;i++){
				if(input[i]==input[i-1]){
					cnt++;
				}else{
					list.add(new Data(input[i-1],cnt+1));
					cnt = 0;
				}
			}
			if(cnt==0){
				list.add(new Data(input[n-1],1));
			}else list.add(new Data(input[n-1], cnt+1)); 
//			System.out.println(list);
			for(int i=0;i<list.size()-2;i++){
				if(!(list.get(i).r=='J'&&list.get(i+1).r=='O'&&list.get(i+2).r=='I'))continue;
				if(list.get(i+1).num>list.get(i).num)continue;
				if(list.get(i+1).num>list.get(i+2).num)continue;
				result = Math.max(result, list.get(i+1).num);
			}
			System.out.println(result);
		}
		class Data{
			char r;
			int num;
			public Data(char r,int num) {
				this.r = r;
				this.num = num;
			}
			public String toString(){
				return r+" "+num;
			}
		}
	}

}