import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long A = sc.nextLong();
	long B = sc.nextLong();
	long min = A;
	if(min > B) min = B;

	if(A%2!=0 && B%2!=0){
	    for(long i=min;i<=A*B;i+=2){
		if(i%A==0 && i%B==0){
		    System.out.print(i);
		    break;
		}
	    } 
	}else{
	    if(min%2==0){
		for(long i=min;i<=A*B;i+=2){
		    if(i%A==0 && i%B==0){
			System.out.print(i);
			break;
		    }
		} 
	    }else{
		for(long i=min+1;i<=A*B;i+=2){
		    if(i%A==0 && i%B==0){
			System.out.print(i);
			break;
		    }
		} 
	    }   
	}
    }
}
