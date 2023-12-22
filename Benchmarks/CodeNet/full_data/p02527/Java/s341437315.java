

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
        int pivot = ints[(right+left)/2];
        int i=left, j=right;
        //System.out.println("init i:"+i+",j:"+j);
        while(true){
            while(ints[i]<pivot&&i<=right)i++;
            while(ints[j]>pivot&&j>=left)j--;
            if(j<=i)break ;
            int tmp = ints[i]; ints[i]=ints[j]; ints[j]=tmp;
            //System.out.println("swqp"+i+"-"+j);printArray(ints);
            i++;j--;        
        }
        //System.out.println("i"+i+"j"+j);printArray(ints);
        if(right-left<=1)return;
        if(i!=left)Qsorted(ints,left,i-1);
        if(i!=right)Qsorted(ints,i,right);
    }

}