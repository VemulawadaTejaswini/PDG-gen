import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[m];
            for(int i=0;i<m;i++){
              a[i]=sc.nextInt();
            }
            
            for(int i=0;i<m;i++){
              n-=a[i];
            }
            if(n<0)n=-1;
            System.out.println(n);
            }

          }
