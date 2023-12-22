import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    
		    if(m==0&&n==0)break;
	    	String s[]=new String[n];
		    for(int i=0;i<n;i++){
		            s[i]=sc.next();
		    }
		    //?????????????????´???????????\??£????????????
		    int player[]=new int[m];
		    for(int i=0;i<m;i++){
		    	player[i]=1;
		    }
		    int turn=0;
		    for(int i=1;i<=n;i++){
		    	//????????£????????´????????????
		    	
		    	
		    	if(s[i-1].compareTo(fizzbuzz(i))!=0){
		    		//??????????????????????????????
		    		player[turn]=0;
		    	}
		    	//???????????????
		    	int j=0;
		    	while(player[turn]==0||j==0){
		    	    turn++;
		    	    if(turn==m)turn=0;
		    	    j++;
		    	}
		    	
		    }
		    for(int i=1;i<=m;i++){
		    	if(player[i-1]==1){
		    	    System.out.print(i);
		    	    if(i<m)System.out.print(" ");
		    	}
		    }
		    System.out.println();
		    
		}			
	}
	static String fizzbuzz(int i){
		if(i%15==0){
			return "FizzBuzz";
		}
		if(i%5==0){
			return "Buzz";
		}
		if(i%3==0){
			return "Fizz";
		}else{
			return String.valueOf(i);
		}
	}
}