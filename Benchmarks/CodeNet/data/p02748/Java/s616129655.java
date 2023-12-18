import java.util.Scanner;
import java.util.Arrays;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int M=sc.nextInt();
        int a[]=new int[A];
        for(int i=0; i<A; i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[B];
        for(int i=0; i<B; i++){
            b[i]=sc.nextInt();
        }
        int m[]=new int[3*M];
        for(int i=0; i<3*M; i++){
            m[i]=sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        int min=a[0]+b[0];
        int sum=0;

		for(int j=0; j<M; j++){
            sum=(a[m[3*j]]+b[m[3*j+1]])-m[3*j+2];
            if(min<sum){
                System.out.println(min);
            }
            else{
                System.out.println(sum);
            }
        }
        sc.close();
    }
}