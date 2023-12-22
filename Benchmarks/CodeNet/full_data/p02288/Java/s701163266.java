import java.util.*;

public class Main {

	static int[] tree = null;
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	tree = new int[N+1];

    	for(int i = 1; i < N+1; i++){
        	tree[i] = sc.nextInt();
        }

        BuildMaxHeap();

        for(int i=1;i < tree.length;i++){System.out.print(" " + tree[i]);}
        System.out.println();
    }

    private static void BuildMaxHeap(){
    	for (int i = (tree.length-1)/2;i>=1;i--){
    		conMaxHeap(i);}
    }
    
    private static void conMaxHeap(int key){
    	int left  = left(key);
    	int right = right(key);
    	int largest = key;
    	if(left  < tree.length){ if(tree[largest] < tree[left] ){largest = left ;}}
    	if(right < tree.length){ if(tree[largest] < tree[right]){largest = right;}}
    	if(largest != key)     { swap(key,largest); conMaxHeap(largest);}
    }

    private static void swap(int i,int j){int temp = tree[i]; tree[i] = tree[j]; tree[j] = temp;}
    private static int left(int i){return 2 * i;}
    private static int right(int i){return 2 * i + 1;}
}