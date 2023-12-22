import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	Scanner sc;
	
	int maximum(int[] array){
		int max=array[0];
		for(int num:array){
			max=num>max?num:max;
		}
		return max;
	}
	
	int solve(int[] sequence,int n){
		int max=maximum(sequence);
		if(max<=0)return max;
		
		LinkedList<Integer> seq=new LinkedList<Integer>();
		seq.addLast(sequence[0]);
		for(int i=1;i<n;++i){
			if(sequence[i]*seq.getLast()<0){
				seq.addLast(sequence[i]);
			}
			else{
				seq.addLast(seq.pollLast()+sequence[i]);
			}
		}
		if(seq.getFirst()<0)seq.pollFirst();
		if(seq.getLast()<0)seq.pollLast();
				
		ListIterator<Integer> i=seq.listIterator();
		while(true){
			int a=i.next();
			if(!i.hasNext()){
				max=Math.max(max,a);
				break;
			}
			int negative=-i.next();
			int b=i.next();
			if(a>=negative&&b>=negative){
				for(int j=0;j<3;++j){
					i.previous();
					i.remove();
				}
				i.add(a+b-negative);
				i.previous();
			}
			else{
				i.previous();
				for(int j=0;j<2;++j){
					i.previous();
					i.remove();
				}
				max=Math.max(max,a);
			}
		}
		return max;
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		int n;
		sc=new Scanner(System.in);
		while((n=sc.nextInt())!=0){
			int[] sequence=new int[n];
			for(int i=0;i<n;++i){
				sequence[i]=ni();
			}
			System.out.println(solve(sequence,n));
		}
	}

	public static void main(String[] args) {
		new Main().io();
	}
}