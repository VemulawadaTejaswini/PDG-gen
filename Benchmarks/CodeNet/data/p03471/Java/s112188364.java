import java.util.*;

public class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int y = sc.nextInt();
	int p = 0;
	int a,b,c = 0;
	boolean flag = false;
	
	for(int i = 0;i<=n;i++){//10000
	    if(flag == true)break;
	    
	    for(int j = 0;j<=n;j++){//5000
		
		for(int k = 0;k<=n;k++){//1000

		    p = (10000*i) + (5000*j) + (1000*k);
		    if(p == y && i+j+k == n){
			flag = true;
			System.out.println(i+" "+j+" "+k);
		        
		    }
		}
	    }
	}
	if(flag == false){
	    System.out.println("-1 -1 -1");
	}
    }
}
