import java.io.*;
import java.util.*;


public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		ArrayList<Integer> intervalList = new ArrayList<Integer>();
		for(int i=0; ;i++){
			int tmp = i*3+1;
			if(tmp > 100 || tmp >= num)
				break;
			intervalList.add(tmp);
		}
		Collections.reverse(intervalList);
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<num;i++)
			list.add(scan.next());
		scan.close();
		InsertionSort insSort = new InsertionSort(num);
		insSort.loadSequence((String[])list.toArray(new String[0]));
		for(int i=0; i<intervalList.size();i++)
			insSort.sort(intervalList.get(i));
			
		//output
		//line#1
		System.out.println(intervalList.size());
		//line#2
		String tmp="";
		for(int i=0; i<intervalList.size();i++)
			tmp = tmp + " " + intervalList.get(i);
		System.out.println(tmp.trim());
		//line#3
		System.out.println(insSort.count);
		//line#4~
		for(int i=0; i<insSort.sortList.size();i++)
			System.out.println(insSort.sortList.get(i));
		
		
	}

}

class InsertionSort extends SortingNumbers{
	int interval = 1;
	int count = 0;
	public InsertionSort(int n){
		super(n);
	}
	
	public void sort(int g){
		interval = g;
		sort();
	}
	@Override
	public void sort(){
		for(int i=interval; i<this.length;i++){
			comparable key = sortList.get(i);
			int j=i-interval;
			for(; j>=0 ;){
				if(sortList.get(j).compValue()<key.compValue())
					break;
				sortList.set(j+interval,sortList.get(j));
				j-=interval;
				count++;
			}
			sortList.set(j+interval, key);
		}
	}
}


interface comparable{
	int compValue();
}
class numbers implements comparable{
	Integer num;
	public numbers(String str){
		num = Integer.parseInt(str);
	}
	@Override
	public int compValue(){
		return num;
	}
	@Override
	public String toString(){
		return num.toString();
	}
}
class SortingNumbers extends Sorting{
		public SortingNumbers(int n){
		super(n);
	}
	@Override
	public void loadSequence(String[] str){
		for(int i=0; i<this.length;i++)
			sortList.add(new numbers(str[i]));
	}
	@Override
	public void sort(){};
}

abstract class Sorting{
	int swapTimes;
	int length;
	ArrayList<comparable> sortList;
	public Sorting(int n){
		swapTimes=0;
		length=n;
		sortList = new ArrayList<comparable>();
	}
	
	@Override
	public String toString(){
		String tmp = "";
		for(int i=0; i<length; i++)
			tmp = tmp + " " + sortList.get(i);
		return tmp.trim();
	}
	void swap(int i, int j){
		swapTimes++;
		comparable tmp = sortList.set(i,sortList.get(j));
		sortList.set(j,tmp);
	}
	abstract public void loadSequence(String[] str);
	abstract public void sort();
}