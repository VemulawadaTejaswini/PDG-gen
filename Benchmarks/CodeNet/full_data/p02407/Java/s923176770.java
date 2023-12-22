import java.util.Scanner;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b[] = new int [n];
 
        for (int i=0;i<n;i++){
          int m = sc.nextInt();
          b[i] = m;
        }
 
        int w;
        for (int h=0;h<(n/2);h++){
          w=b[h];
          b[h]=b[n-1-h];
          b[n-1-h]=w;
        }
 
        for (int j=0;j<n-1;j++){
          System.out.print(b[j] + " ");
        }
        System.out.print(b[n-1]);
        System.out.println("");
    }
}
