import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int N = stdIn.nextInt();
	int[] d1 = new int[N];
	for(int i=0;i<N;i++){
	    d1[i]=stdIn.nextInt();
	}
	int[] d2=d1;
	int sum=0;
	int add=0;
	for(int i=0;i<N;i++){
	    for(int j=0;j<N;j++){
		add=d1[i]*d2[j];
		if(i==j){
		    add=0;
		}
		sum+=add;
	    }
	}
	System.out.println(sum/2);
    }
}
		
