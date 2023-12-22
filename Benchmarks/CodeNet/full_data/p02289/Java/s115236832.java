import java.util.*;

public class Main {

	public static final String INSERT  = "insert",
	                           EXTRACT = "extract",
	                           END     = "end";
	public static final int    ROOT    = 1,
	                           EMPTY   = 0;

	static ArrayList<Integer> tree = new ArrayList<Integer>();
	
    public static void main(String[] args) {
    	String[] s;
    	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
    	tree.add(EMPTY);

    	while(true){
        	 s = sc.next().split("\\s");
        	 if(s[0].equals(INSERT)) {maxHeapInsert(Integer.parseInt(s[1]));}
        	 if(s[0].equals(EXTRACT)){System.out.println(extractMax());}
        	 if(s[0].equals(END))    {break;}
        }

        for(int i=1;i < tree.size();i++){System.out.print(" " + tree.get(i));}
        System.out.println();
    }

    private static void maxHeapInsert(int key){
    	tree.add(key);
    	int child  = tree.size()-1,
    	    parent = -1;
    	while(true){
    		parent = parent(child);
    		if   (parent == 0){break;}
    		if   (tree.get(parent) < tree.get(child)){swap(parent,child); child = parent;}
    		else {break;}
    	}
    }

    private static int extractMax(){
    	int root = tree.get(ROOT);
    	int last = tree.remove(tree.size()-1);
    	if(1 < tree.size()){tree.set(ROOT,last);conMaxHeap(ROOT);}
    	return root;
    }

    private static void conMaxHeap(int key){
    	int left  = left(key);
    	int right = right(key);
    	int largest = key;
    	if(left  < tree.size()){ if(tree.get(largest) < tree.get(left) ){largest = left ;}}
    	if(right < tree.size()){ if(tree.get(largest) < tree.get(right)){largest = right;}}
    	if(largest != key)     { swap(key,largest); conMaxHeap(largest);}
    }

    private static void swap (int i,int j){int temp = tree.get(i); tree.set(i, tree.get(j)); tree.set(j, temp);}
    private static int parent(int i){return i / 2;}
    private static int left  (int i){return 2 * i;}
    private static int right (int i){return 2 * i + 1;}
}