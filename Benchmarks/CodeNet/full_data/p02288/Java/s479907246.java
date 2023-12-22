
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {

    static int N;
    public static Node[] Nodes;

	static long changecount = 0;
   public static void main(String args[]) throws IOException{

	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt( br.readLine()  );
	    Nodes = new Node[N];


	   String[] string =  br.readLine().split(" ");

       for(int i = 0 ; i < N ; i++){
    	   Nodes[i] =  new Node(Integer.parseInt(string[i] ) );
    	  // System.out.print("i ="+i);
       }

       //buildMaxHeap(Nodes);

       for(int i = N/2; 0 <= i ;i--){
      	// System.out.println(i);
      	 maxHeapify(i);
       }
       System.out.print(" ");
       for(int i = 0 ; i < N ; i++){

    	   System.out.print(Nodes[i].key);
    	   if(i < N-1 ){
    		   System.out.print(" ");
    	   }

       }


       System.out.println();




   }


   public static void maxHeapify(int i) {
       int left = i * 2 + 1, right = i * 2 + 2, largest;
       if (left < N && Nodes[left].key > Nodes[i].key) {
               largest = left;
       } else {
               largest = i;
       }
       if (right < N && Nodes[right].key > Nodes[largest].key) {
               largest = right;
       }

       if (largest != i) {
               int tmp = Nodes[i].key;
               Nodes[i].key = Nodes[largest].key;
               Nodes[largest].key = tmp;
               maxHeapify(largest);
       }
}





}



class Node{

	int  key;
    int index;
    Node( int x) {
        key = x;
    }

    void print(){

    	System.out.print("node "+index+": key = " +key+ ", ");
    }


}