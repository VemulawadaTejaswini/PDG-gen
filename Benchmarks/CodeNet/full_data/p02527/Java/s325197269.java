

import java.util.Scanner;

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.valueOf(sc.nextLine());
            int[] ints = new int[n];
            for(int i = 0; i < n; i++){
                ints[i]=sc.nextInt();
            }
            Qsorted(ints,0,n-1);
        }
        
    }
    static void printArray(int[] ints){
        System.out.println(ints[0]);
        for(int i=1; i<ints.length; i++){
            System.out.println(" "+ints[i]);
        }
        System.out.println("");
    }
    static void Qsorted(int[] ints,int left, int right){
        int pivot = ints[(right+left)/2];
        int i=left, j=right;
        while(true){
            while(ints[i]<pivot&&i<=right)i++;
            while(ints[j]>pivot&&j>=left)j--;
            if(i<=j)break ;
            int tmp = ints[i]; ints[i]=ints[j]; ints[j]=tmp;
            i++;j--;        
        }
        if(i!=left)Qsorted(ints,left,i-1);
        if(i!=right)Qsorted(ints,i,right);
    }

}