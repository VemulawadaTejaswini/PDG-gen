import java.util.LinkedList;
import java.util.Scanner;
public class Main {
	static int anotherSide(int[] map,int x){//baseと同じ高さを持つ一番近いｘ座標を返す
		for(int i=x+1;i<map.length;i++){
			if(map[x]==map[i]) return i;
		}
		return -1;
	}
	static double crossProduct(int x1,int y1,int x2,int y2){
		return x1*y2-y1*x2;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String data=scan.next();
		int N=data.length()+1;
		int[] map=new int[N];
		int height=0;
		for(int i=0;i<N;i++ ){
			map[i]=height;
			if(i==N-1){
				break;
			}else{
				if(data.charAt(i)=='\\'){
					height--;
				}else if(data.charAt(i)=='/'){
					height++;
				}else{
					//何もしない。高さが変わらない。
				}
			}
		}
		int base=0;
		int area=0;
		int All=0;
		int nextbase;
		LinkedList<Integer> answer=new LinkedList<Integer>();
		while(true){
			if(base==N-1) break;
			while(!(map[base]>map[base+1])){
				base++;
				if(base==N-1) break;
			}
			nextbase=anotherSide(map,base);
			if(nextbase==-1){//見つからなかった。
				base++;
				continue;
			}else{//水たまりができる。
				//外積
				for(int i=base;i<nextbase;i++){
					area+=crossProduct(i,map[i],i+1,map[i+1]);
				}
				area+=crossProduct(nextbase,map[nextbase],base,map[base]);//面積が求まった
				area/=2;
				All+=area;
				answer.addLast(area);
				area=0;
				base=nextbase;
			}
		}
		System.out.println(All);
		System.out.print(answer.size());
		while(!answer.isEmpty()){
			System.out.print(" "+answer.poll());
		}
		System.out.println();
		scan.close();
	}
}