import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int[] x=new int[3];
        x[0]=sc.nextInt();
        x[1]=sc.nextInt();
        x[2]=sc.nextInt();
        Queue<Integer> q0=new ArrayDeque<>();
        Queue<Integer> q1=new ArrayDeque<>();
        Queue<Integer> q2=new ArrayDeque<>();
        Queue<Integer> ans=new ArrayDeque<>();
        q0.add(x[0]);
        q1.add(x[1]);
        q2.add(x[2]);
        ans.add(0);
        while(q0.size()>0){
            x[0]=q0.poll();
            x[1]=q1.poll();
            x[2]=q2.poll();
            Arrays.sort(x);
            int p=ans.poll();
            if(x[0]==x[1]&&x[1]==x[2]){
                out.println(ans.poll());
                break;
            }else{
                q0.add(x[0]+1);
                q0.add(x[0]+2);
                q1.add(x[1]+1);
                q1.add(x[1]);
                q2.add(x[2]);
                q2.add(x[2]);
                ans.add(p+1);
                ans.add(p+1);
            }
        }
    }
}