import java.util.*;
public class Main
{
    public static void find(int n,long k,int[] ar)
    {
        HashSet<Integer> hs = new HashSet<>();
        int[] p = new int[n];
        int cnt=0;
        int min=1111110;
        int pos=11110;
        for(int j=0;j<ar.length;j++)
        {
            if(min>ar[j])
                {
                    min=ar[j];
                }    
        }
        // System.out.println("min is "+min+" pos is "+pos);
        p[cnt++]=min;
        hs.add(min);
        pos=min;
        int i=0;
        while(true)
        {
            int nextnum = ar[pos-1];
            if(hs.contains(nextnum))
            {
                break;
            }
            p[cnt++]=nextnum;
            pos = nextnum;
            // System.out.println("nextnum is "+nextnum+" pos is "+pos);
        }
        // System.out.println(Arrays.toString(p)+" cnt is "+cnt);
        // System.out.println((k+1)%cnt);
        int rem = (int)(k%(long)cnt);
        // System.out.println(rem);
            System.out.println(p[rem]);

    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    long k=sc.nextLong();
	    int[] ar =new int[n];
	    for(int i=0;i<n;i++)
	        ar[i]=sc.nextInt();
	    
		Main.find(n,k,ar);
	}
}
