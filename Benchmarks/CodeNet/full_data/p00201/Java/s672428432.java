import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static int N;
	static HashMap<String,Integer> map = new HashMap<String,Integer>();
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			N=cin.nextInt();
			if(N==0){
				break;
			}
			Item[] item = new Item[N];
			for(int i = 0;i<N;i++){
				String name = cin.next();
				int cost = cin.nextInt();
				map.put(name,i);
				item[i]=new Item(name,cost);
			}
			int N = cin.nextInt();
			for(int i = 0;i<N;i++){
				String name =cin.next();
				int a=cin.nextInt();
				item[map.get(name)].mix=new Item[a];
				for(int j = 0;j<a;j++){
					String s = cin.next();
					item[map.get(name)].mix[j]=item[map.get(s)];
				}
			}
			for(int i = 0;i<item.length;i++){
				//item[i].print();
			}
			String s = cin.next();
			System.out.println(item[map.get(s)].getMinCost());
		}

	}

}
class Item{
	String name;
	int cost;
	Item[] mix;
	Item(String s,int a){
		name=s;
		cost=a;
	}
	void print(){
		System.out.println(name);
		System.out.println(cost);
		if(mix!=null){
			for(int i = 0;i<mix.length;i++){
				System.out.println(mix[i].name);	
			}
		}
		System.out.println();
	}
	int getMinCost(){
		if(mix==null){
			
		}
		else{
			int sum=0;
			for(int i = 0;i<mix.length;i++){
				sum+=mix[i].getMinCost();
			}
			if(sum<cost){
				cost=sum;

			}
			else{

			}
		}
		return cost;
	}
}