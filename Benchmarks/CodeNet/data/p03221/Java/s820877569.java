
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	
	public static void main(String args[])throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [] City1=new int[M];
		int [] City2=new int[M];
        int [] tag = new int [N];

		
		Map<Integer,Integer> map = new TreeMap<>();
	
		for(int i=0;i<M;i++) {
			City1[i]=sc.nextInt();
			City2[i]= sc.nextInt();
			map.put(City2[i], i);
			
		}
		
		int y=0;
		int z=0;
		for(Integer key : map.keySet()){
			y=map.get(key);
			z = City1[y];
			if(tag[z-1]!=0) {
				City2[y]=tag[z-1];
				tag[z-1]=tag[z-1]+1;
				}else{
					tag[z-1]=1;
					City2[y]=tag[z-1];
					tag[z-1]=tag[z-1]+1;
				}
	      }
		for(int i=0;i<M;i++) {
			System.out.println(String.format("%06d%06d", City1[i],City2[i]));
		}
		
		sc.close();
	}

}
