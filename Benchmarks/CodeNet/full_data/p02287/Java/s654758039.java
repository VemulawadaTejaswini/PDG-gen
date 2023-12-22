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

	//print
	for(int i=1; i<heapTree.length; i++){
	    System.out.print("node "+i+": key = "+heapTree[i]+","+getParent(i)+getLeft(i)+getRight(i));
	    System.out.println(" ");
	}
    }

    static String getParent(int i){
	if(i/2!=0){
	    return " parent key = " + heapTree[i/2] +",";
	}
	else return "";
    }

    static String getLeft(int i){
	if(2*i<heapSize+1){
	    return " left key = "+heapTree[2*i]+",";
	}
	else return "";
    }

    static String getRight(int i){
	if(2*i+1<heapSize+1){
	    return " right key = "+heapTree[2*i+1]+",";
	}
	else return "";
    }

}