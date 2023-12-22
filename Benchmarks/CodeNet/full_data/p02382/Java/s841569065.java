import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int x[] = new int[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextInt();
        }
        sc.nextLine();
        
        int y[] = new int[n];
        for(int i=0;i<n;i++){
            y[i] = sc.nextInt();
        }
        sc.nextLine();
        
        System.out.println(distanceMinkowski(x, y, n, 1));
        System.out.println(distanceMinkowski(x, y, n, 2));
        System.out.println(distanceMinkowski(x, y, n, 3));
        System.out.println(distanceChebyshev(x, y, n));
    }
    static double distanceMinkowski(int x[], int y[], int n, int p){
        double D = 0;
        for(int i=0;i<n;i++){
            D += Math.pow(Math.abs(x[i]-y[i]),p);
        }
        return Math.pow(D,1.0/p);
    }
    static double distanceChebyshev(int x[], int y[], int n){
        double D = 0;
        for(int i=0;i<n;i++){
            double d = Math.abs(x[i]-y[i]);
            if(D<d){
                D = d;
            }
        }
        return D;
    }
}
