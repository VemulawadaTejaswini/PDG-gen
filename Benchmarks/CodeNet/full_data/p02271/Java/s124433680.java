import java.util.Scanner;


class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int[] A = new int[n];
	for(int i=0; i<n; i++){
	    A[i] = sc.nextInt();
	}
	int q = sc.nextInt();
	int[] m = new int[q];
	for(int i=0; i<q; i++){
	    m[i] = sc.nextInt();
	}

	int[][] num = new int[n][2001];
	for(int i=0; i<n;i++){
	    for(int j=0;j<=2000;j++){
		if(j==0){
		    num[i][j] = 1;
		}else{
		    num[i][j] = 0;
		}
	    }
	}
	num[0][A[0]] = 1;
	for(int i=1; i<n;i++){
	    for(int j=0;j<=2000;j++){
		for(int k=0;k<i;k++){
		    if(num[k][j]==1){
			if(j+A[i]>2000){
			    continue;
			}
			num[i][j+A[i]]=1;
		    }
		}
	    }
	}
	

	for(int i=0;i<q;i++){
	    int flag = 0;
	    for(int j=0;j<n;j++){
		if(num[j][m[i]]==1){
		    flag = 1;
		}
	    }
	    if(flag==1){
		System.out.println("yes");
	    }else{
		System.out.println("no");
	    }
	}
    }
}

