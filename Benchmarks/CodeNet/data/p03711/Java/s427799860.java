import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] a1 = {1,3,5,7,8,10,12};
        int[] b1 = {4,6,9,11};
        int[] c1 ={2};
        int cnt1=0;
        int cnt2=0;
        int cnt3=0;

        for(int i = 0;i<a1.length;i++){
            if(x==a1[i]){
                cnt1++;
            }
            if(y==a1[i]){
                cnt1++;
            }
        }

        for(int i = 0;i<b1.length;i++){
            if(x==b1[i]){
                cnt2++;
            }
            if(y==a1[i]){
                cnt2++;
            }
        }

        for(int i = 0;i<c1.length;i++){
            if(x==c1[i]){
                cnt3++;
            }
            if(y==c1[i]){
                cnt3++;
            }
        }


        if(cnt1==2 ||cnt2==2||cnt3==2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}
