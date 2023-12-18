import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Main{
	
	private static int N;
	private static int M;
    private static int[]P;
    private static int[]Y;
    private static List<Integer>tmpP;
    private static HashMap<Integer, ArrayList<Integer>> tmpY;
    private static String result;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		tmpP=new ArrayList<Integer>();
		N=sc.nextInt();
		M=sc.nextInt();
        P=new int[M];
        Y=new int[M];
        for(int i=0;i<M;i++)
        {
        	P[i]=sc.nextInt();
        	Y[i]=sc.nextInt();
        	tmpP.add(P[i]);
        }        
        tmpY=new HashMap<Integer, ArrayList<Integer>>();      
        Set set =new HashSet(tmpP);
        tmpP.clear();
        tmpP.addAll(set);
        for(int i=0;i<tmpP.size();i++)
        {
        	ArrayList<Integer>tmpY1=new ArrayList<Integer>();
        	for(int k=0;k<M;k++)
        	{
        		if(tmpP.get(i)==P[k])
        		{
        			tmpY1.add(Y[k]);	
        		}
        		if(k==M-1&&tmpY1.size()>0)
        		{
        			Collections.sort(tmpY1);
        			tmpY.put(tmpP.get(i), tmpY1);
        		}
        	}
        }
        
      for(int i=0;i<M;i++){
        result=format(P[i]); 
        result+=format(compare(P[i],Y[i])+1);
        System.out.println(result);
        } 
	}
	
	public static String format(int a)
	{
		  int b=0;
		  int c=6-(a+"").toString().length();
		  String m="";
		  for(int i=0;i<c;i++)
		  {
			 m+=(b+"").toString(); 
		  }
		return m+a;
	}
	public static int compare(int k,int value)
	{
		int mid;
		int left=0;
		int len=0;
		int right=0;
		for(int i=0;i<tmpY.size();i++)
		{
			len=tmpY.get(k).size(); 
			right=len-1;
			while(left<=right)
			{
				 // 确保中点靠近区间的起点
		        mid = (right+left)/2;
		        // 如果找到则返回.二分法查找
		        for(int m=0;m<len;m++)
		        {
		        if(tmpY.get(k).get(mid) <value) left= mid+1;
		        else if(tmpY.get(k).get(mid)  > value) right = mid-1;
		        else return mid;
		        }
			}
	    }
		return 0;
	}
}