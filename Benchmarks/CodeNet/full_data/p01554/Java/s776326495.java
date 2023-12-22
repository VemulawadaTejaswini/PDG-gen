package aoj;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int N,M,i,j,key=0;
		String[] ID_U;
		String ID_T;
		Scanner s = new Scanner(System.in);
		
		N= s.nextInt();
		ID_U= new String[N];
		for(i=0;i<N;i++){
			ID_U[i]= s.next();
		}
		
		M= s.nextInt();
		for(j=0;j<M;j++){
			ID_T= s.next();
			for(i=0;i<N;i++){
				if(ID_T.equals(ID_U[i])){
					if(key==0){
						System.out.println("Opened by "+ID_T);
						key=1;
					}else{ System.out.println("Closend by "+ID_T);
						key=0;
					}
					break;
				}
			}
			if(i==N)
				System.out.println("Unknown");
		}
		
		

	}

}