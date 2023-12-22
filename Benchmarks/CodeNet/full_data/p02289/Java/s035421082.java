import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	myMaxHeap heap=new myMaxHeap();
	
	PrintWriter out=new PrintWriter(System.out);
	while(true) {
	    char odr[]=in.next().toCharArray();
	    
	    if(odr[0]=='e' && odr[1]=='n')break;
	    else if(odr[0]=='i')heap.add(Integer.parseInt(in.next()));
	    else {
		out.println(heap.remove());
	    }
	}
	in.close();
	out.flush();
	
    }
    
}

class myMaxHeap{
    private int size=0,array[]=new int[2000001];
    
    myMaxHeap() {
	
    }
    
    public void add(int v) {
	size++;
	array[size]=v;
	
	formatWhenInsertion(size);
    }
    
    private void formatWhenInsertion(int i) {
	int next=i/2;
	
	if(next>=1 && array[i]>array[next]) {
	    int tt=array[next];
	    array[next]=array[i];
	    array[i]=tt;
	    
	    formatWhenInsertion(next);
	}
    }
    
    
    public int remove() {
	int res=array[1];
	
	array[1]=array[size];
	size--;
	tailor(1);
	return res;
    }
    
    public void build() {
	for(int i=size/2;i>=1;i--) {
	    tailor(i);
	}
    }
    
    private void tailor(int i) {
	int indexL=i*2,indexR=i*2+1,max=i;
	
	if(indexL<=size && array[indexL] > array[max])max=indexL;
	if(indexR<=size && array[indexR] > array[max])max=indexR;
	
	if(max!=i) {
	    //System.out.println("swap "+array[max]+" "+array[i]);
	    int tt=array[i];
	    array[i]=array[max];
	    array[max]=tt;
	    
	    tailor(max);
	}
    }
    

    public void dump(PrintWriter out) {
	for(int i=1;i<=size;i++)out.print(" "+array[i]);
	out.println();
	out.flush();
    }
}

