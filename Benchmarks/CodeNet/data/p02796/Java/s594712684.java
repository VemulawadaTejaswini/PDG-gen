import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] nums=new int[n][2];
        int[][] en=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                nums[i][j]=sc.nextInt();
            }
            en[i][0]=nums[i][0]+nums[i][1];
            en[i][1]=i;
        }
        Comp comp=new Comp();
        int ans=0;
        Arrays.sort(en,comp);
        int last=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(last<=nums[en[i][1]][0]-nums[en[i][1]][1]){
                last=en[i][0];
                ans++;
            }
        }
        System.out.println(ans);
 
    }



}
class Comp implements Comparator {

    int index = 0;

    void set_index (int i) {
        index = i;
    }

    public int compare (Object a, Object b) {
        int[] int_a = (int[]) a;
        int[] int_b = (int[]) b;
        return (int_a[index] - int_b[index]);
    }

}