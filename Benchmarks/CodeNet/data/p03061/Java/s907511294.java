

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		
		for(int i=0;i<N;i++){
			A[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(A);
		
		int min_A=A[0];	//Aの中で一番小さい値
		int min_A2=A[1];
		
		 List<Integer> list = new ArrayList<Integer>();

		    for (int i = 1; i * i <= min_A; i++) {  
		        if (min_A % i == 0) {
		            list.add(i);         
		            if (i != min_A / i) {
		                list.add(min_A / i);  
		            }
		        }
		    }
		    for (int i = 1; i * i <= min_A2; i++) {  
		        if (min_A2 % i == 0) {
		            list.add(i);         
		            if (i != min_A2 / i) {
		                list.add(min_A2 / i);  
		            }
		        }
		    }

		
		
		int ans = 1;
	
		for(Iterator<Integer> it = list.iterator(); it.hasNext();){
			int num = it.next();
			boolean flag=false;
			boolean flag_ans=true;
			for(int i=0; i<N;i++){
				if(A[i]%num != 0){
					if(flag){
						flag_ans = false;
						continue;
					}
					flag = true;
				}
			}
			if(flag_ans && ans<num)ans = num;
		
		}
		



		System.out.println(ans);
		
		
		sc.close();
	}
	
}
