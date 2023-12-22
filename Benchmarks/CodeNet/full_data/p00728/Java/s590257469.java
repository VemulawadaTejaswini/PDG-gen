import java.util.*;
class Main{
    void run(){
	Scanner sc=new Scanner(System.in);
	while(true){
	    int n=sc.nextInt();
	    if(n==0)break;
	    int[] A=new int[n];
	    for(int i=0;i<n;i++)
		{
		    A[i]=sc.nextInt();
		}
	    Arrays.sort(A);
	    int sum=0;
	    for(int i=1;i<A.length-1;i++){
		sum+=A[i];
	    }
	    System.out.println(sum/(A.length-2));
	}
    }
    public static void main(String[] args){
	new Main().run();
    }
}