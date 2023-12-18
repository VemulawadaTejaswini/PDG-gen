import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner line= new Scanner(System.in);
        int n=line.nextInt();
        int k=line.nextInt();
        int a[];
      //  int ans=0;
        a= new int[n];
      //  int one=0;
        for(int i=0;i<n;i++){
            a[i]=line.nextInt();
        }
        System.out.printf("%d\n",(n-1+k-2)/(k-1));
        line.close();
    }
}
/*
2 3 1 4 
1 1 1 4  =>2

5,3 => 2
10 3  => 5
1122334455
1  2 3 => 1

7 3 1 8 4 6 2 5
2 1 5 4 (1+3)
*/