import java.util.*;

public class Main{
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	int x = 0;
	int j = 0;
	int n = sc.nextInt();
	int[] table = new int[n];

	for(int i=0;i<n;i++){

	    table[i] = sc.nextInt();
	    
	}

	while(table[j]%2==0){
	    
	    table[j] = table[j]/2;
	    x++;
	    if(j==n-1){
		j=0;
	    }else{
		j++;
	    }
	}
       
	System.out.println(x/n);
    }
}
