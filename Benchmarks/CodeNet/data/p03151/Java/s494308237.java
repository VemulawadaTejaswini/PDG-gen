import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] a = new int[n];
                int[] b = new int[n];
                int[] c = new int[n];
                long bwa = 0;
                long awa = 0;
                long lost = 0;
                int yono = 0;
                for(int i = 0 ; i < n ; i++){
                        a[i] = sc.nextInt();
                        awa += a[i];
                }
                for(int i = 0 ; i < n ; i++){
                        b[i] = sc.nextInt();
                        bwa += b[i];
                        c[i] = a[i] - b[i];
                        if(c[i] < 0){
                                lost -= c[i];
                                yono++;
                        }
                }
                sc.close();
                if(bwa > awa){
                        System.out.println(-1);
                }else{
                        int cha = 0;
                        Arrays.sort(c);
                        while(lost > 0){
                                cha++;
                                lost -= c[n - cha];
                        }
                        System.out.println(cha + yono);
                }
        }
}
//これを制限時間内に解けていれば勝てたのに…