import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ2006().doIt();
	}
	
	class AOJ2006{
		ArrayList<Data> list;
		char[][] map;
		void solve(){
			for(int i=0;i<list.size();i++){
				System.out.print(map[list.get(i).index][list.get(i).n%map[list.get(i).index].length]);
			}
			System.out.println();
		}
		
		void doIt(){
			map = new char[10][];
			map[1] = ".,!? ".toCharArray();map[2] = "abc".toCharArray();map[3]="def".toCharArray();
			map[4]="ghi".toCharArray();map[5]="jkl".toCharArray();map[6]="mno".toCharArray();map[7]="pqrs".toCharArray();
			map[8]="tuv".toCharArray();map[9]="wxyz".toCharArray();
			int n = in.nextInt();
			for(int i=0;i<n;i++){
				String a = in.next();
				list = new ArrayList<Data>();
				int[] b = new int[a.length()];for(int s=0;s<a.length();s++)b[s] = Integer.parseInt(a.charAt(s)+"");
				int sum=0;int before=-1;
				for(int s=0;s<a.length();s++)if(b[s]!=0){
					before = b[s];break;
				}
				for(int s=0;s<a.length();s++){
					if(b[s]==0){
						if(sum==0)continue;
						list.add(new Data(before, sum));
						sum = 0;
						for(int k=s+1;k<a.length();k++)if(b[k]!=0){
							before = b[k];break;
						}
					}else{
						sum++;
					}
				}
				solve();
			}
//			for(int i=0;i<list.size();i++)System.out.println(list.get(i).index+" "+list.get(i).n);
		}
		
		class Data{
			int index,n;
			public Data(int index,int n) {
				this.index = index;
				this.n = n-1;
			}
		}
	}
	
}