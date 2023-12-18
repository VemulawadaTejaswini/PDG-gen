import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] nums=new int[n][2];
        for(int i=0;i<n;i++){
            nums[i][0]=sc.nextInt();
            nums[i][1]=sc.nextInt();
        }
        
        Comp comp=new Comp();
        comp.setIndex(0);
        Arrays.sort(nums,comp);
        long[][] nums2=new long[n][2];
        for(int i=0;i<n;i++){
            nums2[i][0]=nums[i][0];
            nums2[i][1]=nums[i][1];
        }
        long output=0;
        long tmp;
        for(int i=0;i<n;i++){
            tmp=Math.min(nums[i][1],m);
            m-=tmp;
            output+=nums[i][0]*tmp;
            if(m==0)break;
            
        }
        System.out.println(output);

    }
    

}
class Comp implements Comparator{
    int index=0;
    void setIndex(int i){
        index=i;
    }
    public int compare (Object a, Object b) {
        int[] int_a = (int[]) a;
        int[] int_b = (int[]) b;
        return (int_a[index] - int_b[index]);
    }
}  