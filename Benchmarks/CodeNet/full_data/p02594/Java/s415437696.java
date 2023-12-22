import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int K = sc.nextInt();
		int A[];
        A=new int[10000];
		double B[];
        B=new double[10000];
        B[0]=7;
        double d;
        d=1.0;
        for(int i=1;i<10000;i++){
            for(int j=0;j<i;j++){
              d=d*10.0;
            }
        	B[i]=B[i-1]+7.0*d;
        }
        for(int i=0;i<10000;i++){
        	A[i]=(int)B[i];
        }        
        int C[];
        int ff;
        ff=0;
        C=new int[10000];
        for(int i=0;i<10000;i++){
        	C[i]=A[i]%K;
            if (C[i]==0){
                ff=1;
            	System.out.println(i);
                break;
            }
        }
       if(ff==0){
       System.out.println(-1);
       }
	}
}
