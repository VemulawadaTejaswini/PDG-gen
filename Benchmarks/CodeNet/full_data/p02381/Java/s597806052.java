import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ten;
        double[] ten2;
        int sum = 0;
        int mem;
        int i =0;
        double sum2 = 0;
        double bunsan,hensa,heikin ;

        ten = new int[1000];
        ten2 = new double[1000];

        for(i=0;i<100 ;i++){
            mem = sc.nextInt();
            if(mem == 0) break;
            for(i=0;i<mem;i++){
                ten[i] = sc.nextInt();
                sum += ten[i];
            }
            heikin = (double)sum / (double) mem;
            for(i=0;i<mem;i++){
                ten2[i] = ((double)ten[i]-heikin)*((double)ten[i]-heikin);
                sum2 += ten2[i];
            }
            bunsan = sum2/(double)mem;
            hensa = Math.sqrt(bunsan);
            System.out.printf("%.8f",hensa);
            System.out.println();
        }
    }
}
