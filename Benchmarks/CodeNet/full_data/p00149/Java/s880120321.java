import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a=new int[8];

        while (sc.hasNext()) {
            for(int i=0;i<2;i++) {
                double e= sc.nextDouble();
                if(e>=1.1) {
                    a[0+i]++;
                }else if(e>=0.6) {
                    a[2+i]++;
                }else if(e>=0.2) {
                    a[4+i]++;
                }else {
                    a[6+i]++;
                }
            }
        }
        for(int i=0;i<8;i+=2) {
            System.out.println(a[i]+" "+a[i+1]);
        }
    }
}
