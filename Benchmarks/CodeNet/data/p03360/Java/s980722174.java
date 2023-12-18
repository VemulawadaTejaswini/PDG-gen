import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int abc[] = new int[3];
        for(int i=0;i<3;i++){
            abc[i]=sc.nextInt();
        }

        int bai = sc.nextInt();
        int last=1;
        for(int i=1;i<=bai;i++) {
            last = last * 2;
        }
        int max=0;

        for(int i=0;i<3;i++){
            max=Math.max(max,abc[i]);
        }
        int lastmax=max*last;
        int ans=abc[0]+abc[1]+abc[2]-max+lastmax;
        System.out.println(ans);
    }
}