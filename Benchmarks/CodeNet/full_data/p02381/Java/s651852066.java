import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double[] hensa;
        double[] s;
            s = new double[1000];
        hensa = new double[100];
        int i,j,k;
        double n,sum=0,sum2=0;
        double jou,ave;
        for(i=0;i<100;i++){
            sum=0;
            sum2=0;
            n = scan.nextInt();
            if(n==0) break;
            for(j=0;j<n;j++){
                s[j] = scan.nextInt();
                sum+=s[j];
            }
            ave = (double)sum/n;
            for(j=0;j<n;j++){
                jou=(ave-s[j])*(ave-s[j]);
                sum2+=jou;
            }
            hensa[i]=Math.sqrt(sum2/n);   
        }

        for(k=0;k<i;k++){
            System.out.println(String.format("%.8f",hensa[k]));        
        }

}
}
