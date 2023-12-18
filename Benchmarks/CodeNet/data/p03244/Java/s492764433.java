
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//        int[] array_a = new int[n/2];
//        int[] array_b = new int[n/2];

        int[] temp_a = new int[100001];//indexの値御出現数
        int[] temp_b = new int[100001];

        int max_a =0;//最大出現数
        int max_a2 =0;//二番目
        int max_b =0;
        int max_b2 =0;

        int index_a=0;//一番多く出た数
        int index_a2=0;
        int index_b=0;
        int index_b2=0;

        for(int i = 0;i < n;i++) {
            if (i % 2 == 0) {
                temp_a[sc.nextInt()] ++;

            }else{
                temp_b[sc.nextInt()] ++;
            }
        }

        for(int i = 0;i < 100001;i++){
            if(temp_a[i]>max_a){
                max_a = temp_a[i];
                index_a = i;
            }
        }
        for(int i = 0;i < 100001;i++){
            if(temp_b[i]>max_b){
                max_b = temp_b[i];
                index_b = i;
            }
        }

        for(int i = 0;i < 100001;i++){
            if(temp_a[i]>max_a2 && i!=index_a){
                max_a2 = temp_a[i];
                index_a2 = i;
            }
        }
        for(int i = 0;i < 100001;i++){
            if(temp_b[i]>max_b2 && i != index_b){
                max_b2 = temp_b[i];
                index_b2 = i;
            }
        }
        if(index_a != index_b) {
            System.out.println(n - max_a - max_b);
        }else if(max_a > max_b){
            System.out.println(n-max_a-max_b2);
        }else{
            System.out.println(n-max_a2-max_b);
        }
        //11122 11123



//        for(int i = 0;i<n;i++){
//            System.out.print(temp_a[i]+" ");
//            if(i == n-1)
//                System.out.println("");
//        }
    }
}