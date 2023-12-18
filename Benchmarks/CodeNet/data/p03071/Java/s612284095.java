import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        //変数
        int count=0;
        boolean sw=false;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int answer=0;
        int tmp=0;
        List<Long> list1=new ArrayList<>();
        int array1[]=new int[5];
        //入力
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        //処理
        for(int i=0;i<2;i++) {
            if (A > B) {
                answer += A;
                A--;
            } else if (A < B) {
                answer += B;
                B--;
            } else {
                answer += A;
                A--;
            }
        }
        /*
        Collections.sort(a);
        System.out.println(Arrays.toString(a.toArray()));
        //System.out.println(Arrays.toString(X));
		//System.out.println(Arrays.deepToString(a));
        */
        System.out.println(answer);
    }
}