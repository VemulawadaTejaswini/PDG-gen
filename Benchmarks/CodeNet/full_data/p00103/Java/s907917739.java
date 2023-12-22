import java.util.*;

public class Main {
    public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	
	int N =sc.nextInt();
	int i,j,B=0,out;
	String A;
	int a [][]= new int[N][4];
	
	for (i=0;i<N;i++){
		out=0;
		do{
			A=sc.next();
			if (A=="OUT") B=0;if (A=="HIT") B=1;if (A=="HOMERUN") B=2;
			switch (B){
			case 0:out++; break;
			case 1:a[i][0]+=a[i][3]; a[i][3]=a[i][2]; a[i][2]=a[i][1]; a[i][1]=1; break;
			case 2:a[i][0]+=(a[i][3]+a[i][2]+a[i][1]+1);
			for(j=1;j<4;j++) a[i][j]=0;break;
		}
		}while(out<3);
	}
	
	for (i=0;i<N;i++)
	System.out.println(a[i][0]);
	
    }
}