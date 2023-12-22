import java.io.*; 
import java.util.*; 
  
class Main
{ 
  
   
    static HashSet<Integer>[] segment; 
  
   
    static void build(int i, int s, int e, int[] arr) 
    { 
  
       
        if (s == e) 
        { 
            segment[i].add(arr[s]); 
            return; 
        } 
  
        
        build(2 * i, s, (s + e) / 2, arr); 
        build(1 + 2 * i, 1 + (s + e) / 2, e, arr); 
  
       
        segment[i].addAll(segment[2 * i]); 
        segment[i].addAll(segment[2 * i + 1]); 
    } 
  
   
    static HashSet<Integer> query(int node, int l,  
                                int r, int a, int b) 
    { 
        HashSet<Integer> left = new HashSet<>(); 
        HashSet<Integer> right = new HashSet<>(); 
        HashSet<Integer> result = new HashSet<>(); 
  
        if (b < l || a > r) 
            return result; 
  
        
        if (a <= l && r <= b) 
            return segment[node]; 
  
        left = query(2 * node, l, (l + r) / 2, a, b); 
        result.addAll(left); 
  
        right = query(1 + 2 * node, 1 + (l + r) / 2, r, a, b); 
        result.addAll(right); 
  
    
        return result; 
    } 
  
    // Initialize the segment tree 
    @SuppressWarnings("unchecked") 
    static void init(int n)  
    { 
  
        // Get the height of the segment tree 
        int h = (int) Math.ceil(Math.log(n) / Math.log(2)); 
        h = (int) (2 * Math.pow(2, h)) - 1; 
  
        // Initialize the segment tree 
        segment = new HashSet[h]; 
        for (int i = 0; i < h; i++) 
            segment[i] = new HashSet<>(); 
    } 
  
    // Function to get the result for the 
    // subarray from arr[l] to arr[r] 
    static void getDistinct(int l, int r, int n) 
    { 
  
        // Query for the range set 
        HashSet<Integer> ans = query(1, 0, n - 1, l, r); 
  
        System.out.println(ans.size()); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int q = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++)
        	arr[i] = sc.nextInt();
        
        init(n); 
  
        // Bulid the segment tree 
        build(1, 0, n - 1, arr); 
  
        while(q-- >0)
       getDistinct(sc.nextInt(), sc.nextInt(), n); 
    }
} 