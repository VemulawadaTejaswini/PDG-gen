import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n];
			
            for(int i=1;i<n;i++){
              a[i]=sc.nextInt();
            }

            for(int i=1;i<n+1;i++){
              int count = 0;
              for(int j=1;j<n;j++){
                if(a[j]==i) count++;
              }
              System.out.println(count);
            }

          }
}
