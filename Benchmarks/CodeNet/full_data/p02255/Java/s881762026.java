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
		InsertionSort insSort = new InsertionSort(num);
		insSort.loadSequence((String[])list.toArray(new String[0]));
		insSort.sort();
		System.out.println(insSort);
//ss.loadSequence((String[])list.toArray(new String[0]));
	}

}

class InsertionSort extends SortingNumbers{
	public InsertionSort(int n){
		super(n);
	}

	@Override
	public void sort(){
		for(int i=1; i<this.length;i++){
			System.out.println(this);
			comparable key = sortList.get(i);
			int j=i-1;
			for(; j>=0 ;j--){
				if(sortList.get(j).compValue()<key.compValue())
					break;
				sortList.set(j+1,sortList.get(j));
			}
			sortList.set(j+1, key);
		}
	}
}

class SelectionSort extends SortingNumbers{
	public SelectionSort(int n){
		super(n);
	}
	@Override
	public void sort(){
		for(int i=0; i<this.length;i++){
			int minIndex=i;
			for(int j=i; j<this.length;j++){
				if(sortList.get(j).compValue()<sortList.get(minIndex).compValue())
					minIndex = j;
			}
			if(i!=minIndex)
				swap(i,minIndex);
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

class cards implements comparable{
	char type;
	Integer number;
	public cards(String str){
		type = str.charAt(0);
		number = Integer.parseInt(str.substring(1,str.length()));		
	}
	public int compValue(){
		return number;
	}
	@Override
	public String toString(){
		return type + number.toString();
	}
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