import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public void go() throws IOException
    {
        StringTokenizer tok = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tok.nextToken());
        int m = Integer.parseInt(tok.nextToken());
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            tok = new StringTokenizer(in.readLine());
            jobs.add(new Job(Integer.parseInt(tok.nextToken()), Integer.parseInt(tok.nextToken())));
        }
        Collections.sort(jobs);
        PriorityQueue<Job> pq = new PriorityQueue<>((a, b) -> {
            if (a.reward == b.reward)
            {
                return -Integer.compare(a.time, b.time);
            }
            return Integer.compare(a.reward, b.reward);
        });
        long sum = 0;
        for (Job j : jobs)
        {
            if (m - pq.size() >= j.time)
            {
                pq.add(j);
                sum += j.reward;
            }
            else if (!pq.isEmpty())
            {
                if (j.reward > pq.peek().reward)
                {
                    sum -= pq.remove().reward;
                    pq.add(j);
                    sum += j.reward;
                }
            }
        }
        out.println(sum);

        out.flush();
        in.close();
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }

    private class Job implements Comparable<Job>
    {
        int time, reward;

        public Job(int tm, int rw)
        {
            this.time = tm;
            this.reward = rw;
        }

        public int compareTo(Job other)
        {
            if (time == other.time)
            {
                return -Integer.compare(reward, other.reward);
            }
            return -Integer.compare(time, other.time);
        }
    }
}
