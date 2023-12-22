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
        List<String> amari = new ArrayList<String>();
        List<String> roop = new ArrayList<String>();
        int i = 1;
        do{
            amari.add(Integer.toString(i));
            roop.add(Integer.toString(i));
            hash.put(i, true);
            i = A[i-1];
        }while(hash.get(i) == null);
        for(int j = 0; j < amari.indexOf(Integer.toString(i)); j++){
            roop.remove(0);
        }
        int roopN = roop.size();
        if(K >= amari.indexOf(Integer.toString(i))){
            System.out.println(roop.get((int)((K-amari.indexOf(Integer.toString(i)))%roopN)));
        }else{
            System.out.println(amari.get((int)(K-1)));
        }
        
	}
} 