import java.io.*;
import java.math.BigInteger; 
import java.util.*;

//Mann Shah [ DAIICT ].
//fast io

public class Main {
	static int mod = (int) (1e9+7);
	static long N = (long)(2*1e5);
	static InputReader in;
    static PrintWriter out;
    static Debugger deb;
    
    
    public static int gcd(int a, int b){ 
	    if (a == 0) 
	        return b;  
	    return gcd(b % a, a);  
    } 
      
    // method to return LCM of two numbers 
    public static int lcm(int a, int b){ 
        return (a*b)/gcd(a, b); 
    } 
    
    public static int lcm_of_array_elements(int[] element_array) 
    { 
        int lcm_of_array_elements = 1; 
        int divisor = 2; 
          
        while (true) { 
            int counter = 0; 
            boolean divisible = false; 
              
            for (int i = 0; i < element_array.length; i++) { 
  
                // lcm_of_array_elements (n1, n2, ... 0) = 0. 
                // For negative number we convert into 
                // positive and calculate lcm_of_array_elements. 
  
                if (element_array[i] == 0) { 
                    return 0; 
                } 
                else if (element_array[i] < 0) { 
                    element_array[i] = element_array[i] * (-1); 
                } 
                if (element_array[i] == 1) { 
                    counter++; 
                } 
  
                // Divide element_array by devisor if complete 
                // division i.e. without remainder then replace 
                // number with quotient; used for find next factor 
                if (element_array[i] % divisor == 0) { 
                    divisible = true; 
                    element_array[i] = element_array[i] / divisor; 
                } 
            } 
  
            // If divisor able to completely divide any number 
            // from array multiply with lcm_of_array_elements 
            // and store into lcm_of_array_elements and continue 
            // to same divisor for next factor finding. 
            // else increment divisor 
            if (divisible) { 
                lcm_of_array_elements = lcm_of_array_elements * divisor; 
            } 
            else { 
                divisor++; 
            } 
  
            // Check if all element_array is 1 indicate  
            // we found all factors and terminate while loop. 
            if (counter == element_array.length) { 
                return lcm_of_array_elements; 
            } 
        } 
    } 
    
	public static void main(String args[] )  {
			
		in = new InputReader(System.in);
	    out = new PrintWriter(System.out);
	    deb = new Debugger();
	    
	    char[] s = in.readString().toCharArray();
	    if(s[2]==s[3]) {
	    		if(s[4]==s[5]) {
	    			out.println("Yes");
	    		}
	    		else {
	    			out.println("No");
	    		}
	    }
	    else {
	    		out.println("No");
	    }
	    
	    out.close();
	}
		
/* TC space


 */
		
		static class InputReader
	    {
	        private final InputStream stream;
	        private final byte[] buf = new byte[8192];
	        private int curChar, snumChars;
	        private SpaceCharFilter filter;

	        public InputReader(InputStream stream)
	        {
	                this.stream = stream;
	        }

	        public int snext()
	        {
	                if (snumChars == -1)
	                        throw new InputMismatchException();
	                if (curChar >= snumChars)
	                {
	                        curChar = 0;
	                        try
	                        {
	                                snumChars = stream.read(buf);
	                        } catch (IOException e)
	                        {
	                                throw new InputMismatchException();
	                        }
	                        if (snumChars <= 0)
	                                return -1;
	                }
	                return buf[curChar++];
	        }

	        public int nextInt()
	        {
	                int c = snext();
	                while (isSpaceChar(c))
	                {
	                        c = snext();
	                }
	                int sgn = 1;
	                if (c == '-')
	                {
	                        sgn = -1;
	                        c = snext();
	                }
	                int res = 0;
	                do
	                {
	                        if (c < '0' || c > '9')
	                                throw new InputMismatchException();
	                        res *= 10;
	                        res += c - '0';
	                        c = snext();
	                } while (!isSpaceChar(c));
	                return res * sgn;
	        }

	        public long nextLong()
	        {
	                int c = snext();
	                while (isSpaceChar(c))
	                {
	                        c = snext();
	                }
	                int sgn = 1;
	                if (c == '-')
	                {
	                        sgn = -1;
	                        c = snext();
	                }
	                long res = 0;
	                do
	                {
	                        if (c < '0' || c > '9')
	                                throw new InputMismatchException();
	                        res *= 10;
	                        res += c - '0';
	                        c = snext();
	                } while (!isSpaceChar(c));
	                return res * sgn;
	        }

	        public int[] nextIntArray(int n)
	        {
	                int a[] = new int[n];
	                for (int i = 0; i < n; i++)
	                {
	                        a[i] = nextInt();
	                }
	                return a;
	        }

	        public long[] nextLongArray(int n)
	        {
	                long a[] = new long[n];
	                for (int i = 0; i < n; i++)
	                {
	                        a[i] = nextLong();
	                }
	                return a;
	        }
	        
	        public ArrayList<Integer> nextArrayList(int n){
	        			ArrayList<Integer> x = new ArrayList<Integer>();
	        			for(int i=0;i<n;i++) {
	        				int v = in.nextInt();
	        				x.add(v);
	        			}
	        			return x;
	        }

	        public String readString()
	        {
	                int c = snext();
	                while (isSpaceChar(c))
	                {
	                        c = snext();
	                }
	                StringBuilder res = new StringBuilder();
	                do
	                {
	                        res.appendCodePoint(c);
	                        c = snext();
	                } while (!isSpaceChar(c));
	                return res.toString();
	        }

	        public String nextLine()
	        {
	                int c = snext();
	                while (isSpaceChar(c))
	                        c = snext();
	                StringBuilder res = new StringBuilder();
	                do
	                {
	                        res.appendCodePoint(c);
	                        c = snext();
	                } while (!isEndOfLine(c));
	                return res.toString();
	        }

	        public boolean isSpaceChar(int c)
	        {
	                if (filter != null)
	                        return filter.isSpaceChar(c);
	                return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	        }

	        private boolean isEndOfLine(int c)
	        {
	                return c == '\n' || c == '\r' || c == -1;
	        }

	        public interface SpaceCharFilter
	        {
	                public boolean isSpaceChar(int ch);
	        }

	    }
		
		static class Debugger{
			public void n(int x) {
				out.println(x);
			}
			
			public void a(int[] a) {
		        StringBuilder sb = new StringBuilder();
		        for(int i=0;i<a.length;i++) {
		        		sb.append(a[i]+" ");
		        }
		        out.println(sb.toString());
			}
		}
		
}



//Pair arr[] = new Pair[n]; 
//arr[0] = new Pair(10, 20); 
 class Pair { 
    int x; 
    int y; 
  
    // Constructor 
    public Pair(int x, int y) 
    { 
        this.x = x; 
        this.y = y; 
    } 
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Pair)) return false;
	    Pair p = (Pair) o;
	    return x == p.x && y == p.y;
	}
} 
// class Compare { 
//	  //void return by default.
//    static Pair[] compare(Pair arr[], int n) 
//    { 
//        // Comparator to sort the pair according to first element.
//        Arrays.sort(arr, new Comparator<Pair>() { 
//            @Override public int compare(Pair p1, Pair p2) 
//            { 
//                return p1.x - p2.x; 
//            } 
//        }); 
//        
//        return arr;
//    } 
//} 




class couple implements Comparable<couple>
{ int x,y;
  public couple(int m,int f) {
 	 x=m;
 	 y=f;
  }
	public int compareTo(couple o) {
		
		 
		return x-o.x;
	}  
}
