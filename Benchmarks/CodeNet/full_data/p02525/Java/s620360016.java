import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            double a=0;
            if(n==0){
                break;
            }
            int s[] = new int[n];
            double m=0;
 
            for (int i = 0; i < n; i++) {
                s[i]=sc.nextInt();
                m+=s[i];
            }
            m/=n;
            for(int j=0;j<n;j++){
                a+=(s[j]-m)*(s[j]-m);
            }
            System.out.println(Math.sqrt(a/n));
 
        }
    }
}