import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	int[] H = new int[N];

	int ans = 1;

	for(int i=0; i<N; i++){

	H[i] = sc.nextInt();

  }
  
	if(N>=2){
  
	if(H[0]<=H[1]){
		
		ans = 0;
	
	}
  
	for(int i=1; i<N-1; i++){

	if(ans == 0){

	if(H[i]-H[i+1] == 1 && H[i]!=H[i-1]){

	H[i] -= 1;
	
	ans = 0;	    

    }

	else if(H[i] <= H[i+1]){

	ans = 0;	

    }

	else{

	ans = 1;

    }

   }
   

  }
	
	if(ans == 0){
	
	System.out.println("Yes");

  }
	else{

	System.out.println("No");

  }

	}
	
	if(N==1){
		
		System.out.println("Yes");
		
	}

  
 }
}