import java.util.*;



public class Main {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int l[] = new int[n];

        for(int i=0; i<n; i++)
        {
            l[i]=sc.nextInt();
        }
        Arrays.sort(l);
        int result=114514;
        for(int i=0; i<n-1; i++)
        {
            if(result>Math.abs(l[i]-l[i+1]))
            {
                result=Math.abs(l[i]-l[i+1]);
            }
        }
        System.out.println(result);
    }


}

