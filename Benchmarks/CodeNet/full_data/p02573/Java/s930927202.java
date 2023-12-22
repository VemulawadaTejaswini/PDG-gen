import java.util.*;

public class Main {
    static int[] A;
   static int[] B;
    static int[] C;

   static int N;
  static int m;

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
N=scan.nextInt();

 A=new int[N];
         B=new int[N];
         C=new int[N];

        for(int i=0;i<N;i++){
            A[i]=scan.nextInt()-1;
        B[i]=scan.nextInt()-1;
        }
        int M=0;
for(int j=0;j<N;j++){
   if(C[j]==0){ m=1;
    C[j]=1;
    dfs(j);
    if(m>M){M=m;}}
}


System.out.println(M);
        }
static void dfs(int i){
for(int k=0;k<N;k++){
    if (i==A[k]&&C[B[k]]==0){C[B[k]]=1;
    m++;
        dfs(B[k]);}
else if (i==B[k]&&C[A[k]]==0){C[A[k]]=1;
m++;
    dfs(A[k]);}
}

    }}

