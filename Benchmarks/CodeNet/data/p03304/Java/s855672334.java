import java.util.Scanner;
class atc{
	public static void main(String[]args){
		Scanner stdIn=new Scanner(System.in);
		 int n=stdIn.nextInt();
		int m=stdIn.nextInt();
		int d=stdIn.nextInt();
		double count=0.0;
		double r=1.0;
		long x=1;
		long []a=new long[m];
		long []b=new long[m];
		long []c=new long[m];
    

    for (int t=0;t<m;t++){
        c[t]=x;
        x=x*n;
		r=r*n;
    }

    for (int k=0;k<x;k++){
        for (int j=0;j<m;j++){
            if (j==0){
                a[j] = k / c[m - 1];
                b[j] = k % c[m - 1];
            }
            else{
                a[j]=b[j-1]/c[m-j-1];
                b[j]=b[j-1]%c[m-j-1];
            }
        }
       for (int i=0;i<m-1;i++){
           if (a[i]+d==a[i+1]||a[i]-d==a[i+1]) count++;
       }
    }
    System.out.println(count/r);
}
}
	