import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        Queue<Process> queue = new ArrayDeque<Process>();
        for(int i=0; i<n; i++) {
            Process p = new Process(sc.next(),sc.nextInt());
            queue.add(p);
        }
        int pTime = 0;
        int b = 0;
        String[] result = new String[n];
        while(queue.size()>0) {
            Process pro = queue.poll();
            if(pro.time>q) {
                pro.time -= q;
                queue.add(pro);
                pTime += q;
            } else {
                pTime += pro.time;
                result[b] = pro.name+" "+Integer.toString(pTime);
                b++;
            }
        }
        for(String s:result) {
            System.out.println(s);
        }
    }
}
class Process{
    String name;
    int time;
    Process(String name, int time) {
        this.name=name;
        this.time=time;
    }
}

