
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int x= in .nextInt();
        int[] l= new int[n];
        for(int i=0;i<n;i++)
            l[i]=in.nextInt();
        int d=0,i=0;
        for(;i<n;i++){
            d=d+l[i];
            if(d>x)
                break;
        }
        System.out.println(i+1);


    }
}
