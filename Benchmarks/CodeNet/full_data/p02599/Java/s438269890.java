import java.util.*;
import java.io.*;
public class Main {
    static class Scan {
        private byte[] buf=new byte[1024];
        private int index;
        private InputStream in;
        private int total;
        public Scan()
        {
            in=System.in;
        }
        public int scan()throws IOException
        {
            if(total<0)
            throw new InputMismatchException();
            if(index>=total)
            {
                index=0;
                total=in.read(buf);
                if(total<=0)
                return -1;
            }
            return buf[index++];
        }
        public int scanInt()throws IOException
        {
            int integer=0;
            int n=scan();
            while(isWhiteSpace(n))
            n=scan();
            int neg=1;
            if(n=='-')
            {
                neg=-1;
                n=scan();
            }
            while(!isWhiteSpace(n))
            {
                if(n>='0'&&n<='9')
                {
                    integer*=10;
                    integer+=n-'0';
                    n=scan();
                }
                else throw new InputMismatchException();
            }
            return neg*integer;
        }
        public double scanDouble()throws IOException
        {
            double doub=0;
            int n=scan();
            while(isWhiteSpace(n))
            n=scan();
            int neg=1;
            if(n=='-')
            {
                neg=-1;
                n=scan();
            }
            while(!isWhiteSpace(n)&&n!='.')
            {
                if(n>='0'&&n<='9')
                {
                    doub*=10;
                    doub+=n-'0';
                    n=scan();
                }
                else throw new InputMismatchException();
            }
            if(n=='.')
            {
                n=scan();
                double temp=1;
                while(!isWhiteSpace(n))
                {
                    if(n>='0'&&n<='9')
                    {
                        temp/=10;
                        doub+=(n-'0')*temp;
                        n=scan();
                    }
                    else throw new InputMismatchException();
                }
            }
            return doub*neg;
        }
        public String scanString()throws IOException
        {
            StringBuilder sb=new StringBuilder();
            int n=scan();
            while(isWhiteSpace(n))
            n=scan();
            while(!isWhiteSpace(n))
            {
                sb.append((char)n);
                n=scan();
            }
            return sb.toString();
        }
        private boolean isWhiteSpace(int n)
        {
            if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
            return true;
            return false;
        }
    }
    // Each segment of the segment tree would be a set 
    // to maintain distinct elements 
    static HashSet<Integer>[] segment; 
  
    // Build the segment tree 
    // i denotes current node, s denotes start and 
    // e denotes the end of range for current node 
    static void build(int i, int s, int e, int[] arr) 
    { 
  
        // If start is equal to end then 
        // insert the array element 
        if (s == e) 
        { 
            segment[i].add(arr[s]); 
            return; 
        } 
  
        // Else divide the range into two halves 
        // (start to mid) and (mid+1 to end) 
        // first half will be the left node 
        // and the second half will be the right node 
        build(2 * i, s, (s + e) / 2, arr); 
        build(1 + 2 * i, 1 + (s + e) / 2, e, arr); 
  
        // Insert the sets of right and left 
        // node of the segment tree 
        segment[i].addAll(segment[2 * i]); 
        segment[i].addAll(segment[2 * i + 1]); 
    } 
  
    // Query in an range a to b 
    static HashSet<Integer> query(int node, int l,  
                                int r, int a, int b) 
    { 
        HashSet<Integer> left = new HashSet<>(); 
        HashSet<Integer> right = new HashSet<>(); 
        HashSet<Integer> result = new HashSet<>(); 
  
        // If the range is out of the bounds 
        // of this segment 
        if (b < l || a > r) 
            return result; 
  
        // If the range lies in this segment 
        if (a <= l && r <= b) 
            return segment[node]; 
  
        // Else query for the right and left 
        // leaf node of this subtree 
        // and insert them into the set 
        left = query(2 * node, l, (l + r) / 2, a, b); 
        result.addAll(left); 
  
        right = query(1 + 2 * node, 1 + (l + r) / 2, r, a, b); 
        result.addAll(right); 
  
        // Return the result 
        return result; 
    } 
  
    // Initialize the segment tree 
    @SuppressWarnings("unchecked") 
    static void init(int n)  
    { 
  
        // Get the height of the segment tree 
        int h = (int) Math.ceil(Math.log(n) / Math.log(2))+1; 
        h = (int) (2 * Math.pow(2, h)) - 1; 
  
        // Initialize the segment tree 
        segment = new HashSet[h]; 
        for (int i = 0; i < h; i++) 
            segment[i] = new HashSet<>(); 
    } 
  
    // Function to get the result for the 
    // subarray from arr[l] to arr[r] 
    static int getDistinct(int l, int r, int n) 
    { 
  
        // Query for the range set 
        HashSet<Integer> ans = query(1, 0, n - 1, l, r); 
  
        return ans.size(); 
    } 
  
    // Driver Code 
    public static void main(String[] args) throws IOException{ 
        Scan input=new Scan();
        int n = input.scanInt();
        int query=input.scanInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=input.scanInt();
        }
  
        init(n); 
  
        // Bulid the segment tree 
        build(1, 0, n - 1, arr); 
        StringBuilder ans=new StringBuilder("");
        // Query in range 0 to 4 
        for(int q=1;q<=query;q++) {
            int l=input.scanInt()-1;
            int r=input.scanInt()-1;
            ans.append(getDistinct(l, r, n)+"\n");
        }
        System.out.println(ans);
    } 
}
