import java.util.Scanner;


class Main{

    public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	int n,A,B,C,D;
	n = in.nextInt();

	int[][] WRY = new int[n][1];
	for(int i=0;i<n;i++)WRY[i][0]=0;

	for(int i=0;i<n*(n-1)/2;i++){
	    A = in.nextInt();
	    B = in.nextInt();
	    C = in.nextInt();
	    D = in.nextInt();
	    if(C > D){
		WRY[A-1][0]+=3;
	    }
	    else if(D > C){
		WRY[B-1][0]+=3;
	    }
	    else {
		WRY[A-1][0]++;
		WRY[B-1][0]++;
	    }

	}
       
	int ookii=0;
	int tiisai=0;
	int onazi=0;

	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++){
		if(WRY[i][0]>WRY[j][0] && i != j)tiisai++;
		else if(WRY[i][0]<WRY[j][0] && i != j)ookii++;
		else if(WRY[i][0] == WRY[j][0] && i!=j)onazi++;
	    }
	    if(tiisai == 0){
		System.out.println(n-onazi);
	    }else if(ookii == 0){
		System.out.println(1);
	    }else{
	    System.out.println((n-onazi)-tiisai);	  
	    }  
	    onazi=0;
	    ookii=0;
	    tiisai=0;

	}



    }


}