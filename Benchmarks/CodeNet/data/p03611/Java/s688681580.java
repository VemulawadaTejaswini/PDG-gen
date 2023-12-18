import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[3*N];
        for (int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<3*N;i++){
            if (i<N){
                b[i] = a[i];
            }else if(i<2*N){
                b[i] = a[i-N]+1;
            }else{
                b[i] = a[i-2*N]-1;
            }
        }
        int t_cnt =0;
        int[] cntB = new int[3*N];
        
        for(int i=0;i<3*N;i++){
            int tmp = b[i];
            for(int k=i;k<3*N;k++){
                if (b[k]==tmp){
                    t_cnt++;
                }
            }
            cntB[i] = t_cnt;
            t_cnt = 0;
        }
        int max=0;
        for(int i=0;i<3*N;i++){
            if(cntB[i]>max){
                max = cntB[i];
            }
        }
        System.out.println(max);
    }
    
}
