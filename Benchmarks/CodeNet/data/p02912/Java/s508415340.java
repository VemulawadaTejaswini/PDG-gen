import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {
    //abc141 d

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int ary[] = new int[n];
        for(int i = 0;i < ary.length;i++) ary[i] = sc.nextInt();
        while(num > 0){
            int k = 0;
            int max = -1;
            for(int j = 0;j <ary.length;j++){
                if(max<ary[j])k = j;
            }
            ary[k] /=2;
            num--;
        }
        long ans=0;
        for(int i = 0; i<ary.length;i++)ans += ary[i];
        System.out.print(ans);
    }
}
