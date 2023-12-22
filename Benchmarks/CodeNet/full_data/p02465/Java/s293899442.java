import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = stdIn.nextInt();
		}
		
		int m = stdIn.nextInt();
		int b[] = new int[m];
		for(int i = 0; i < m; i++){
		    b[i] = stdIn.nextInt();
		}
		
		int aindex = 0;
		int bindex = 0;
		
		while(true){
		    if(a[aindex] == b[bindex]){
		        aindex++;
		        bindex++;
		    }else if(a[aindex] > b[bindex]){
		        bindex++;
		    }else if(a[aindex] < b[bindex]){
		        System.out.println(a[aindex]);
		        aindex++;
		    }
		    
		    if(aindex == n){
		        break;
		    }
		    
		    if(bindex == m){
		        for(int i = aindex; i < n; i++){
		            System.out.println(a[i]);
		        }
		        break;
		    }
		}
        
		stdIn.close();
	}

}


