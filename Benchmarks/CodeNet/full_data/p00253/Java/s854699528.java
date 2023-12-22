import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	while(true){
	    int n=sc.nextInt();
	    if(n==0)break;
	    int[] prt=new int[n+1];
	    int[] x=new int[n];
	    for(int i=0;i<n+1;i++){
		prt[i]=sc.nextInt();
		
	    }
	    for(int i=0;i<n+1;i++){
		boolean ts=true;
		int size=0;
		for(int j=0;j<n+1;j++){
		    if(j!=i){
			x[size]=prt[j];
			size++;
		    }
		}
		for(int j=1;j<n-1;j++){
		    if(x[0]-x[1]!=x[j]-x[j+1])ts=false;
		}


		if(ts){
		     System.out.println(prt[i]);
		     break;
		}
	    }
	}
    }
    public static void main(String[]ag){
	new Main().main();
    }
}