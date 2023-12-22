
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        int A[] = new int[N];        
        
        for(int i=0; i<N; i++) {
        	A[i] = sc.nextInt();
        }
        
        int nexta = 1;
        int count = 0;
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        do{
        	array.add(nexta);
        	count+=1;
        	nexta = A[nexta-1];
        }while(!array.contains(nexta));
        
        int ind = array.indexOf(nexta);
        
        if(K<count) {
        	System.out.println(array.get((int) K));
        }else {
            long b = K -ind;
            b = b % (count-ind);
            
            System.out.println(array.get((int) (ind+b)));
        	
        }
        
	}
}
