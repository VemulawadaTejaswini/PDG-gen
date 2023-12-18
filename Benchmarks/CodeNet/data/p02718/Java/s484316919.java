import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int n=stdIn.nextInt();
	int m=stdIn.nextInt();
	Integer[] aa=new Integer[n];
	for(int l=0;l<n;l++){
	    aa[l]=stdIn.nextInt();
	}
	int sum=0;
	for(int i=0;i<aa.length;i++){
	    sum+=aa[i];
	}
	int k=sum/(4*m);

	Arrays.sort(aa, Collections.reverseOrder()); 
	if(aa[m-1]<k){
	    System.out.println("No");
	}else{
	    System.out.println("Yes");
	}   
    }
}
	    
