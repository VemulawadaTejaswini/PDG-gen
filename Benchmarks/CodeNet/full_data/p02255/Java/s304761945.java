import java.util.*;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tar;
		
		List<Integer> lis = new LinkedList<>();
		for( int i=0 ;i < n ;i ++){
			lis.add(sc.nextInt());
		}
		printLis(lis);
		for(int j = 1 ; j < n ; j++)
		{
			tar = lis.get(j);
			int k = j - 1 ;
			while( k >= 0 && lis.get(k) > tar )
			{
				k--;
			}
			
			if( k++ != j - 1 ){
				lis.remove(j);
				lis.add(k,tar);
			}
				printLis(lis);
			
		
		}
	}
	public static void printLis(List<?> list){
		for(int i = 0; i<list.size()-1;i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println(list.get(list.size()-1));
	}
}