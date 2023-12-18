import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Scanner scan =new Scanner(System.in);

    int N= scan.nextInt();
    int A[] = new int[N];
    A[0]=-1;

    int i=1;


    while (i<N) {A[i]=scan.nextInt()-1;
    i=i+1;


    }
    int B[]= new int[N];
    int i3=0;
    while (i3<N) {

        int i2 = 0;
        B[i3]=0;
        while (i2 < N) {

            if (A[i2] == i3) {
                B[i3]=B[i3]+1;

            }


i2=i2+1;
        }System.out.println(B[i3]);
i3=i3+1;

    }

	// write your code here


    }
}
