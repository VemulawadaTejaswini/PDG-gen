import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int count=0;
             n= scan.nextInt();
        for(int i=1;i<=n;i++){
             for(int j=1;j<=n;j++){
                 for(int k=1;k<=n;k++){
                     if(i*j+k==n) count++;
                 }
            }
        }
        System.out.println(count);
    }
}
