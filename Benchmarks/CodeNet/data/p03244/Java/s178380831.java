import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]o=new int[100001];
        int[]e=new int[100001];
        for(int i=0;i<n;i+=2){
            o[sc.nextInt()]++;
            e[sc.nextInt()]++;
        }
        int maxe=0;
        int max2e=0;
        int maxo=0;
        int max2o=0;
        int eind=0;
        int oind=0;
        for(int i=0;i<100001;i++){
            if(maxe<=e[i]){
                max2e=maxe;
                maxe=e[i];
                eind=i;
            }
        }
        for(int i=0;i<100001;i++){
            if(maxo<=o[i]){
                max2o=maxo;
                maxo=o[i];
                oind=i;
            }
        }
        System.out.println((oind==eind)?Math.min(n-maxo-max2e,n-max2o-maxe):n-maxo-maxe);
    }
}