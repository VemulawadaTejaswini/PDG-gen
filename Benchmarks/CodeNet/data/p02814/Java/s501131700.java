import java.util.*;
public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    int m;
    int c=0;
    int d=1;

    n=sc.nextInt();
    m=sc.nextInt();
    int a[] = new int[n];

    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }

    for(int q=0;q<n;q++){
        do{
            double t=0;
            t=a[q]*(d+0.5);
            d++;
            c++;
        }while(a[q]*(d+0.5)>m);
    }
    System.out.println(c);

}
}