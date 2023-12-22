import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		Combination<Integer> c = new Combination<Integer>();
		for(int i=0; i<n; i++)
			c.add(scan.nextInt());
		c.combAll();
		Iterator<ArrayList<Integer>> iter;
		iter = c.getIter();
		ArrayList<Integer> sumList = new ArrayList<Integer>();
		
		while(iter.hasNext()){
			ArrayList<Integer> tmp = iter.next();
			int sum = 0;
	       	for(int i : tmp)
				sum += i;
			sumList.add(sum);
		}
		
		int queryNum = scan.nextInt();
		for(int i=0 ;i<queryNum; i++){
			if(sumList.contains(scan.nextInt()))
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}


class Combination<T> extends ArrayList<T>{
    int r;
    int n;
	ArrayList<T> seq = new ArrayList<T>();
	ArrayList<ArrayList<T>> seqList= new ArrayList<ArrayList<T>>();
	public void combAll(){
		for(int i = 1; i<=this.size() ;i++)
				comb(i);
	}
	public void comb(int r){
		this.r = r;
		combine(0);
	}
    public void combine(int index){
        if(seq.size() == r){
	        seqList.add(seqCopy());
        }else{
	        for ( int i = index; i< this.size()-(r-seq.size()-1); i++ ){
	             seq.add(this.get(i));
	             combine(i+1);
	             seq.remove(seq.size()-1);
	        }
        }
	}
	ArrayList<T> seqCopy(){
		ArrayList<T> tmp = new ArrayList<T>();
		for(int i=0;i<seq.size() ;i++)
			tmp.add(seq.get(i));
		return tmp;
	}
	public Iterator<ArrayList<T>> getIter(){
		return seqList.iterator();
	}
}

/*?¶????????¨????
class Combination<T> extends ArrayList<T>{
    int r;
    int n;
	ArrayList<T> elements;// = new ArrayList<T>();
	ArrayList<T> seq = new ArrayList<T>();
	//ArrayList<ArrayList<t>> iter;
    public Combination(ArrayList<T> list){
			elements = list;
    }
	public void loadElements(Scanner scan){
	//	elements = list;
	}
	public void comb(int r){
		this.r = r;
		seq = new ArrayList<T>();
		for(int i=0; i<r ;i++)
			seq.add(null);
		combine(0,0);
	}
    public void combine( int m ,int index){
        if ( m == r ){
         for ( int i=0; i<r; i++ )
             System.out.print(" " + seq.get(i));
             
        	System.out.println("");
        
        }else{
        //  for ( int i = index + 1; i<n-(r-m-1); i++ ){
        for ( int i = index; i<elements.size()-(r-m-1); i++ ){
             seq.set(m, elements.get(i));
             combine(m+1,i+1);
        }
        }
	}
}
*/