import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] A = new double[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextDouble();
        }
        int count = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){

                if(A[i]*A[j]%1==0){
                    count++;
//                    System.out.println(i+" "+j+"  "+A[i]+"*"+A[j]+"     "+A[i]*A[j]+" "+(A[i]*A[j]%1==0?"true":"flase"));
                }
            }
        }
        System.out.println(count);
    }
}