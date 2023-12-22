

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //while(sc.hasNextInt()){
            int n =sc.nextInt();
            int[] ints = new int[n];
            for(int i = 0; i < n; i++){
                ints[i]=sc.nextInt();
            }
            Qsorted(ints,0,n-1);
            System.out.println(printArray(ints));
        //}
        
    }
    static String printArray(int[] ints){
        String str = ints[0]+"";
        for(int i=1; i<ints.length; i++){
            str+=" "+ints[i];
        }
        return str;
    }
    static void Qsorted(int[] ints,int left, int right){
        for(int len=ints.length;len>1;len--){
        for(int i=1; i<len; i++){
            if(ints[i-1]>ints[i]){
                int tmp = ints[i-1]; ints[i-1]=ints[i]; ints[i]=tmp;
            }
        }
        }
    }

}