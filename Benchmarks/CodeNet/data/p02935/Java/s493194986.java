import java.util.*;


public class Main  {
    private static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        double s=a[0];
        for(int i=1;i<n;i++){
            s=(s+a[i])/2;
        }
        System.out.print(s);


    }}
