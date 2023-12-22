import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
int N=scan.nextInt();

int M=scan.nextInt();

long K=scan.nextLong();

long A[]=new long [N];
        long B[]=new long [M];
for(int i=0;i<N;i++){ A[i]=scan.nextInt();
}
for(int i=0;i<M;i++){ B[i]=scan.nextInt();}

int n=0;
int m=0;
int p=0;
int ea=0;
int eb=0;

while((K-A[n]>=0||K-B[m]>=0)&&m<M&&n<N&&(ea==0||eb==0)) {
    if((A[n]>B[m]&&ea==0)||(eb==1&&K-B[m]>=0)){K=K-B[m];
    m++;
    p++;}
    if (m==M){
        m--;
        ea=1;
    }
    if((A[n]<=B[m]&&eb==0)||(ea==1&&K-A[n]>=0)){K=K-A[n];
        n++;
    p++;}

    if (n==N){
        n--;
        eb=1;
    }
}
System.out.println(p);
}

    }





