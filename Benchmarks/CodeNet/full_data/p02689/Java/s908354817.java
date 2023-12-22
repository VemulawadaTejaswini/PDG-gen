import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
int N= scan.nextInt();
        int M= scan.nextInt();
long H[]=new long[N];
int i=0;
int S[]=new int[N];
int i2=0;
while (i2<N){H[i2]=scan.nextLong();
i2=i2+1;}

while (i<M) {int A=scan.nextInt()-1;
int B=scan.nextInt()-1;

    if(H[A]>=H[B]){S[B]=S[B]+1;};
    if(H[B]>=H[A]){S[A]=S[A]+1;};

i=i+1;

}
int P=0;
int i1=0;

        while (i1<N) {if (S[i1]==0){P=P+1;

        };



            i1=i1+1;}

        System.out.println(P);


}

       }

