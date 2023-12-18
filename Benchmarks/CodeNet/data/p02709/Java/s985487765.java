import java.util.*;
public class Main
{
    static int lo; static int hi;
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); LinkedList<Student> a = new LinkedList<>();
        for (int i = 0; i < n; i++) a.add(new Student(i, sc.nextInt()));
        lo = 0; hi = n - 1; Collections.sort(a); long ans = 0; int done = 0;
        while (done < n) {
            Student s = a.removeFirst();
            if (Math.abs(s.index - lo) >= Math.abs(s.index - hi)) {
                ans += Math.abs(s.index - lo) * s.act;
                lo++;
            } else {
                ans += Math.abs(s.index - hi) * s.act;
                hi--;
            }
            done++;
        }
        System.out.println(ans);
    }

    static class Student implements Comparable<Student> {
        int index; long act;
        Student(int index, long act) {
            this.index = index; this.act = act;
        }

        @Override
        public int compareTo(Student o) {
            long dist1 = Math.max(Math.abs(index - lo) * act, Math.abs(index - hi) * act);
            long dist2 = Math.max(Math.abs(o.index - lo) * o.act, Math.abs(o.index - hi) * o.act);
            return -1*Long.compare(dist1, dist2);
        }
    }


}