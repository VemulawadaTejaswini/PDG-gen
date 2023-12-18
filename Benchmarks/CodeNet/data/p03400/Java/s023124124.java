import java.util.*;
public class Main {
    public static void main(String[] argas){
        Scanner sc = new Scanner(System.in);
        int n,d,x,choco_num=0;
        n=sc.nextInt();
        d=sc.nextInt();
        x=sc.nextInt();
        choco_num =n;
        int [] a = new int[n];
        for(int b=0;b<n;b++){
            a[b] = sc.nextInt();
        }

        for(int b=0;b<n;b++){
            int num=0;
            for(int c=1;c<d;c++){
                int day = c*a[b]+1;
                if(day<=d){
                    num = num+1;
                }
                else break;
            }
            choco_num = choco_num+num;
        }
        choco_num+=x;
        System.out.println(choco_num);
    }
}
