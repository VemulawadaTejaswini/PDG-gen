import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int M = scan.nextInt();
			int[] A = new int[N];
			int[] B = new int[N];
			int goukei = 0;
			int goukeikinngaku = 0;
			//int[] Sort = new int [N];
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				B[i] = scan.nextInt();
				map.put(A[i], B[i]);
			}
			
			
			Object[] mapkey = map.keySet().toArray();
			
			Arrays.sort(mapkey);//昇順に並べたはず安い順
			
			Set<Integer> mapA = map.keySet();
			
			for (Iterator<Integer> n = mapA.iterator(); n.hasNext();){
				int Ai = n.next();
				int Bi = map.get(Ai);
				int shuuryou=0;
	           // System.out.println(Ai);
	            //System.out.println(Bi);
	            for(int i =1;i<=Bi;i++) {
	            	if(goukei<M) {
	            		goukei+=1;
	            		goukeikinngaku +=Ai;
	            	}
	            	if(goukei==M) {
	            		shuuryou =1;
	            		break;
	            	}
	            }
	            
	            if(shuuryou==1) {
	            	break;
	            }
	            
	        }
			
			
			System.out.println(goukeikinngaku);
			
			
			/*for (Integer nKey : map.keySet()){
				
				
	            System.out.println(map.get(nKey));
	        }*/
			
			
			
			
			
	
			
			
			
			
			
			
			
			
			
			
		}
	}
}
