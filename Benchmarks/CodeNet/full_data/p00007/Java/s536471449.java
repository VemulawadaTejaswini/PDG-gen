import java.util.*;

class Main{
    public static void main(String[] args){
	int sum=100000,add,k;
	Scanner s = new Scanner(System.in);

	k=s.nextInt();
	for(int i=0;i<k;i++){
	    sum*=1.05;
	    if( (add=sum%1000)>0 ){
		sum=sum-add+1000;
	    }
	}

	System.out.println( sum );

    }
}