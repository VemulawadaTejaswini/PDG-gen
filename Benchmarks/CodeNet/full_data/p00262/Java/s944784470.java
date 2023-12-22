import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int N,sum,ans;
	static Block block;
	static List<Block> list= new LinkedList<Block>();
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		label:while(true){
			N=cin.nextInt();
			if(N==0)break;
			sum=cin.nextInt();
			ans=0;
			list= new LinkedList<Block>();
			list.add(new Block(sum));
			for(int i=1;i<N;i++){
				int in=cin.nextInt();
				sum+=in;
				list.add(new Block(in));
			}
			int sankaku=1;
			int step=2;
			while(true){
				if(sankaku==sum){
					break;
				}
				sankaku+=step++;
				if(sankaku>(100*101)/2){
					System.out.println(-1);
					continue label;
				}
			}
			while(true){
				step=1;
				int s=0;
				for(Block b:list){
					if(step!=b.num)break;
					step++;
					s+=b.num;
				}
				if(sum==s){
					System.out.println(ans);
					break;
				}
				ans++;
				if(ans>10000){
					System.out.println(-1);
					continue label;
				}
				int size=list.size();
				List<Integer> rm=new ArrayList<Integer>();
				for(int i=0;i<list.size();i++){
					Block b=list.get(i);
					b.num--;
					if(b.num==0){
						list.remove(i);
						i--;
					}
				}
				list.add(new Block(size));

				for(Block b:list){
//					System.out.println(b.num);
				}
//				System.out.println();

//				System.out.println(sum+" "+s);
//
			}
		}

	}
	static class Block{
		int num;
		Block left,right;
		Block(int a){
			num=a;
		}
	}
}