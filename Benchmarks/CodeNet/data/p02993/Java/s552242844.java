import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        List<Job> jobs = new ArrayList<Job>();
        for(int i =0;i<n;i++){
            int t= in.nextInt();
            int p = in.nextInt();
            jobs.add(new Job(t,p));
        }
        Collections.sort(jobs);
        String ans ="Yes";
        int s =0;
        for(Job v : jobs){
            s+=v.time;
            if(s>v.period) {
                ans="No";
                break;
            }
        }
        out.print(ans);
        out.close();
    }
    static public class Job implements Comparable<Job>{
        int time;
        int period;
        public Job(int time, int period){
            this.time = time;
            this.period=period;
        }
        public String toString(){
            return "["+time+","+period+"]";
        }
        public int compareTo(Job o){
            int compare = Integer.compare(period,o.period);
            if (compare==0){
                compare=Integer.compare(time,o.time);
            }
            return compare;

        }
    }


}
