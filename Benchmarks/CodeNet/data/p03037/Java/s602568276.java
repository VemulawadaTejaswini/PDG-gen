
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int m=in.nextInt();
        int min=1, max=n;
        for(int i=0;i<m;i++){
            int lb=in.nextInt();
            int ub=in.nextInt();

            if(lb>=min)
                min=lb;
            if(ub<=max)
                max=ub;
        }
        int ans= max-min+1;
        System.out.println(ans);
    }
}
