import java.io.*;
import java.util.*;


public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<num;i++)
			list.add(scan.next());
		scan.close();
		CountingSort cs = new CountingSort(num);
		cs.loadSequence((String[])list.toArray(new String[0]));
		cs.sort();
		System.out.println(cs);

	}

}

class CountingSort extends Sorting{
	int[] seq;
	int[] sorted;
	public CountingSort(int n){
		super(n);
		seq = new int[n];
		sorted = new int[n];
	}
	@Override
	public void loadSequence(String[] str){
		for(int i=0; i<this.length;i++)
			seq[i] = Integer.parseInt(str[i]);
	}
	int maxElement(){
		int max = seq[0];
		for(int i=1;i<this.length;i++)
			if(max<seq[i])
				max=seq[i];
		return max;
	}

	@Override
	public void sort(){
		int[] counter = new int[maxElement()+1];
		for(int i=0; i<this.length;i++)
			counter[seq[i]]++;
		for(int i=1; i<=maxElement();i++)
			counter[i] += counter[i-1];
		for(int i=this.length-1;i>=0;i--){
			System.out.println(--counter[seq[i]]);
			sorted[counter[seq[i]]] = seq[i];
		}
	}
	@Override
	public String toString(){
		String tmp = "";
		for(int i=0; i<this.length; i++)
			tmp = tmp + " " + sorted[i];
		return tmp.trim();
	}

}

abstract class Sorting{
	int swapTimes;
	int length;
	//ArrayList<comparable> sortList;
	public Sorting(int n){
		swapTimes=0;
		length=n;
	//	sortList = new ArrayList<comparable>();
	}
	

/*	void swap(int i, int j){
		swapTimes++;
		comparable tmp = sortList.set(i,sortList.get(j));
		sortList.set(j,tmp);
	}*/
	abstract public void loadSequence(String[] str);
	abstract public void sort();
}