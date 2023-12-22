import java.util.*;
 
import java.io.*;
 
public class Main{
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long K = s.nextLong();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = s.nextInt();
        }
        HashMap<Integer, Boolean> hash = new HashMap<Integer, Boolean>();
        List<Integer> amari = new ArrayList<Integer>();
        List<Integer> roop = new ArrayList<Integer>();
        int i = 1;
        do{
            amari.add(i);
            roop.add(i);
            hash.put(i, true);
            i = A[i-1];
        }while(hash.get(i) == null);
        for(int j = 0; j < amari.indexOf(i); j++){
            roop.remove(0);
        }
        int roopN = roop.size();
        if(K >= amari.indexOf(i)){
            System.out.println(roop.get((int)((K-amari.indexOf(i))%roopN)));
        }else{
            System.out.println(amari.get((int)(K)));
        }
        
	}
} 