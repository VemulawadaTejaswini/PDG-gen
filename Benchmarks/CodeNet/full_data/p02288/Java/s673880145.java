import java.io.*;
class Main{
    static int heapSize;
    static int[] heapTree;

    public static void main(String[] args){
	BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
	String line = new String();

	//read Tree
	try{
	    line = bin.readLine();
	}
	catch(IOException e){
	    System.out.println("Error");
	}
	heapSize=Integer.parseInt(line);
	heapTree = new int[heapSize+1];
	//heapTree[0]=2000000010;

	try{
	    line=bin.readLine();
	}
	catch(IOException e){
	    System.out.println("Error");
	}

	//make Tree
	String[] key = line.split(" ");
	for(int i=1; i<heapTree.length; i++){
	    heapTree[i]=Integer.parseInt(key[i-1]);
	}

	//buildMaxHeap
	for(int i = heapSize/2; i>=1; i--)maxHeapify(i);

	//print
	for(int i=1; i<heapTree.length; i++){
	    System.out.print(" "+heapTree[i]);
	}
	System.out.println("");
    }
    
    /*
    static String getParent(int i){
	if(i/2!=0){
	    return " parent key = " + heapTree[i/2] +",";
	}
	else return "";
    }
    */
    static int getLeft(int i){
	if(2*i<heapSize+1){
	    return 2*i;
	}
	else return 0;
    }

    static int getRight(int i){
	if(2*i+1<heapSize+1){
	    return 2*i+1;
	}
	else return 0;
    }
    
    static void maxHeapify(int i){
	int l = getLeft(i);
	int r = getRight(i);
	int largest;

	if(l<=heapSize && heapTree[l]>heapTree[i])largest=l;
	else largest = i;

	if(r<=heapSize && heapTree[r]>heapTree[largest])largest=r;
	if(largest!=i){
	    int x = heapTree[i];
	    heapTree[i]=heapTree[largest];
	    heapTree[largest]=x;
	    maxHeapify(largest);
	}
    }
}