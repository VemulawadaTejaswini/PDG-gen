import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0061().doIt();
	}
	
	class AOJ0061{
		void doIt(){
			ArrayList<Data> list = new ArrayList<Data>();
			while(in.hasNext()){
				String[] a = in.next().split(",");
				if(a[0].equals("0")&&a[1].equals("0"))break;
				list.add(new Data(Integer.parseInt(a[0]),Integer.parseInt(a[1])));
			}
			Collections.sort(list);
//			for(int i=0;i<list.size();i++)System.out.println(list.get(i).id+" "+list.get(i).ans);
			while(in.hasNext()){
				int num = in.nextInt();
				int result = 1;
				for(int i=1;i<list.size();i++){
					if(list.get(i-1).ans>list.get(i).ans)result++;
					if(list.get(i).id==num)break;
				}
				if(list.get(0).id==num)result = 1;
				System.out.println(result);
			}
		}
		class Data implements Comparable<Data>{
			int ans,id;
			public Data(int id,int ans) {
				this.id = id;
				this.ans = ans;
			}
			public int compareTo(Data o) {
				if(this.ans>o.ans)return -1;
				else if(this.ans<o.ans)return 1;
				return 0;
			}
		}
	}
	
}