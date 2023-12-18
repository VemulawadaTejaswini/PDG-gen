
import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in); 
		int N=in.nextInt();
        int[] A=new int[N];
        long width=0,breadth=0;
        int i=0;
        Map<Integer,Integer> mp=new HashMap<>();
        while(N>i)
        {
            A[i]=in.nextInt();
            if(mp.get(A[i])==null)
            {
            	mp.put(A[i], 1);
            }
            else
            {
            	mp.put(A[i], mp.get(A[i])+1);
            }
            i++;
        }
         long prev=0;;
        for(Map.Entry<Integer, Integer> entry :mp.entrySet())
        {
        	if(entry.getValue()>=2&&entry.getValue()%4!=0)
			{
        		width=entry.getKey();
        		breadth=prev;
        		prev=width;
			}
        	if(entry.getValue()%4==0)
        	{	
        		width=breadth=entry.getKey();
        	}
        }
        System.out.println(width*breadth);
	}
}
