import java.util.Scanner;

/**
 *
 * @author ena000078
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int s[] = new int[N];
        int max = 0;
        for(int i=0;i<N;i++){
            s[i] = sc.nextInt();
            max+=s[i];
        }
        if (max%10!=0){
            System.out.println(max);
        }else{
            int ss[] = sort(s);
            for(int i=0;i<ss.length;i++){
                if((max-ss[i]) % 10 != 0){
                    System.out.println(max-ss[i]);
                    return;
                }
            }
            System.out.println(0);
        }
    }
    static int[] sort(int s[]){
        int ans[] = s;
        
        for (int i=0;i<ans.length;i++){
            int min = ans[i];
            for (int k=i+1;k<ans.length;k++){
                if (min > ans[k]){
                    ans[i] = ans[k];
                    ans[k] = min;
                    min = ans[i];
                }
            }
        }
        
        return ans;
    }
}