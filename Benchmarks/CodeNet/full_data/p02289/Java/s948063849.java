import java.io.*;
class Main{
    final static int ERROR=-1;

    static int heapSize=0;
    static long[] heapTree = new long[2000000];

    public static void main(String[] args){
	BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
	String line = new String();
	StringBuffer returned = new StringBuffer("");

	//read Tree
	while(true){
	    try{
		line=bin.readLine();
	    }
	    catch(IOException e){
		System.out.println("Error");
	    }

	    //what's this command?
	    String[] key = line.split(" ");
	    //end or extract
	    if(key.length<2){
		if(key[0].equals("end"))break;
		else{
		    returned.append(heapExtractMax()+"\n");
		}
	    }
	    //insert
	    else{
		maxHeapInsert(Long.parseLong(key[1]));
	    }
	}
	System.out.print(returned);
    }
    
    //------------------------------------------------------
    //get methods
    static int getParent(int i){
	    return i/2;
    }

    static int getLeft(int i){
	return 2*i;
    }

    static int getRight(int i){
	return 2*i+1;
    }
    
    //other methods
    static void maxHeapify(int i){
	int l = getLeft(i);
	int r = getRight(i);
	int largest=1;

	if(l<=heapSize && heapTree[l]>heapTree[i])largest=l;
	else largest = i;
	if(r<=heapSize && heapTree[r]>heapTree[largest])largest=r;
	if(largest!=i){
	    long x = heapTree[i];
	    heapTree[i]=heapTree[largest];
	    heapTree[largest]=x;
	    maxHeapify(largest);
	}
    }

    static void maxHeapInsert(long key){
	heapSize++;
	heapTree[heapSize]=Long.MIN_VALUE;
	heapIncreaseKey(heapSize, key);
    }

    static void heapIncreaseKey(int i, long key){
	long x;
	if(key < heapTree[i])return;
	heapTree[heapSize]=key;
	while(i>1 && heapTree[getParent(i)]<heapTree[i]){
	    x=heapTree[i];
	    heapTree[i]=heapTree[getParent(i)];
	    heapTree[getParent(i)]=x;
	    i=getParent(i);
	}
    }

    static long heapExtractMax(){
	if(heapSize < 1)return ERROR;
	long max = heapTree[1];
	heapTree[1]=heapTree[heapSize];
	heapSize--;
	maxHeapify(1);
	return max;
    }
}