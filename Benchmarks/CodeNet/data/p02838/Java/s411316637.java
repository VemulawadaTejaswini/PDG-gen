import java.util.*;

 class Main {
	static List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	static int t_dist[], a_dist[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long[] a = new long[(int)N];
        int[] b = new int[63];
        
        for(int i=0;i<N;i++) {
        	a[i] = sc.nextLong();
        	String bin = Long.toBinaryString(a[i]);
//        	System.out.println(bin);
        	for(int j=0;j<bin.length();j++) {
//        		String tmp = bin.substring(j,j+1);
        		if("1".equals(bin.substring(bin.length()-j-1,bin.length()-j))) {
        			b[j]++;
        		}
        	}
        }
        long ans=0;
        for(int i=0;i<63;i++) {
//        	System.out.println(b[i]);
//        	System.out.println(Math.pow(2, i)*b[i]*(N-b[i]));
        	ans = (long) Math.floorMod((long) (ans + Math.pow(2, i)*b[i]*(N-b[i])), 1000000007);
        }
        System.out.println(ans);	
        
        
    }

}