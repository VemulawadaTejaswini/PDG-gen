import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int q=sc.nextInt();
        StringBuilder sb=new StringBuilder(s);
        int count=0;
        boolean flag=false;
        for(int i=0;i<q;i++)
        {
            int t=sc.nextInt();
            if(t==1)
            {
                count++;
                flag=!flag;
                continue;
            }
            else
            {
                int f=sc.nextInt();
                char c=sc.next().charAt(0);
                if(f==1) {
                    if (flag) {
                        sb.append(c);
                    } else {
                        sb.insert(0, c);
                    }
                }
                else
                {
                    if (flag) {
                        sb.insert(0, c);
                    } else {
                        sb.append(c);
                    }
                }
            }
        }
        if(count%2==1) sb=sb.reverse();
        System.out.println(sb.toString());
    }
}