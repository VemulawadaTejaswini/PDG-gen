import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int[] wight = {1,2,4,8,16,32,64,128,256,512};

	while(sc.hasNext()){

	    int n = sc.nextInt();
	    int nn = n;
	    int[] record = new int[wight.length];

	    while(n!=0){
		for(int i=9; i>=0; i--){
		    //System.out.println(n+" "+wight[i]);
		    if(n-wight[i]>=0 && record[i]==0){record[i] = 1; n-=wight[i];}
		}
	    }

	    for(int i=0; i<record.length; i++){
		if(record[i]==1){
		    System.out.print(wight[i]+" ");
		}
	    }
	    System.out.println();
	}
    }
}