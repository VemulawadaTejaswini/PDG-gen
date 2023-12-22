import java.util.*;

public class soccer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int tokuten[] =  new int[N+1
		for(int i = 0;i<N*(N-1)/2;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int a1 = sc.nextInt();
		    int b1 = sc.nextInt();
		    
		    if (a1 > b1){
		    	tokuten[a] += 3;
		    }else if (a1 < b1){
		    tokuten[b] += 3;
		    }else{
		    tokuten[a] += 1;
		    tokuten[b] += 1;
		    }
		}

		for(int i = 1; i < N+1; i++){
			int length = 1;
			for(int j = 0; j < N+1; j++){
				if(tokuten[i] < tokuten[j])
					length += 1;
			}
		    System.out.println(length);
		}
	}
}