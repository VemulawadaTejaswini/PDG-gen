import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int index=0;
        int pre=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(pre>=a){
                index++;
            }
            else{
                max=Math.max(max,index);
                index=0;
            }
            pre=a;
        }
        max=Math.max(max,index);
        System.out.println(max);
    }
}
