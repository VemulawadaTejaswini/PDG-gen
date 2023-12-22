import java.util.Scanner;


 class Main{

	public static boolean search(int A[],int n,int key){
		 A[n]=key;  //???????????¨???????????¢??¢?´¢.
		 int i = 0;
		 while(A[i] != key) 
			 i++;
		return i!= n;
	}
	public static void main(String[] args) {
		int A[]=new int[10001];
		int i,j,n,q,key,sum=0;
		
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<n;i++){
			A[i]=s.nextInt();
		}
		
		q=s.nextInt();
		for(j=0;j<q;j++){
			key=s.nextInt();
			if(search(A,n,key))
                          sum++;
		}
	  System.out.println(sum);
	}

}