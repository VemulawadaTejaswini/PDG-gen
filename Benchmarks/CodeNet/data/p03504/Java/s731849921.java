


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public class comparator implements Comparator<program> {

        @Override
        public int compare(program p1, program p2) {
            if (p1.start < p2.start) {
                return -1;
            } else if (p1.start > p2.start) {
                return 1;
            } else {
                if (p1.end > p2.end) {
                    return 1;
                } else if (p1.end < p2.end) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    public class comparator2 implements Comparator<recorder> {

        @Override
        public int compare(recorder r1, recorder r2) {
            if (r1.end < r2.end) {
                return -1;
            } else if (r1.end > r2.end) {
                return 1;
            } else {
                if (r1.start < r2.start) {
                    return -1;
                } else if (r1.start > r2.start) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    public class program {
        public int start;
        public int end;
        public int channel;
        public program(int s, int e, int c) {
            start = s;
            end = e;
            channel = c;
        }
        public String toString() {
            return "[" + start + ", " + end + ") : " + channel;
        }
    }

    public class recorder {
        public int start;
        public int end;
        public recorder(int s, int e) {
            start = s;
            end = e;
        }
        public String toString() {
            return "[" + start + ", " + end + ")";
        }

    }
    public void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        program[] p = new program[n];
        for (int i = 0; i < n; ++i) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            int channel = sc.nextInt();
            p[i] = new Main.program(s, t, channel);
        }
        Arrays.sort(p, new comparator());
        int [] used = new int[n];
        PriorityQueue<recorder> priorityQueue = new PriorityQueue(n, new comparator2());
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (used[i] == 1) {
                continue;
            }
            int currentStart = p[i].start;
            int currentEnd = p[i].end;
            int channel = p[i].channel;

            if (!priorityQueue.isEmpty()) {
                recorder r = priorityQueue.peek();
                if (r.end < currentStart) {
                    //can use
                    int newEnd = currentEnd;
                    int newStart = currentStart - 1;
                    int j = i;
                    used[j] = 1;
                    j = i + 1;
                    int choosed = -1;
                    int maxE = currentEnd;
                    while (j < n && p[j].start == currentEnd) {
                        if (p[j].channel == channel) {
                            if (maxE <= p[j].end) {
                                maxE = p[j].end;
                                choosed = j;
                            }
                        }
                        ++j;
                    }
                    if (choosed >= 0) {
                        used[choosed] = 1;
                        newEnd = maxE;
                    }
                    priorityQueue.poll();
                    priorityQueue.add(new recorder(newStart, newEnd));
                } else {
                    //cannot use
                    ++count;
                    //can use
                    int newEnd = currentEnd;
                    int newStart = currentStart - 1;
                    int j = i;
                    used[j] = 1;
                    j = i + 1;
                    int choosed = -1;
                    int maxE = currentEnd;
                    while (j < n && p[j].start == currentEnd) {
                        if (p[j].channel == channel) {
                            if (maxE <= p[j].end) {
                                maxE = p[j].end;
                                choosed = j;
                            }
                        }
                        ++j;
                    }
                    if (choosed >= 0) {
                        used[choosed] = 1;
                        newEnd = maxE;
                    }
                    priorityQueue.add(new recorder(newStart, newEnd));
                }
            } else {
                //cannot use
                ++count;
                //can use
                int newEnd = currentEnd;
                int newStart = currentStart - 1;
                int j = i;
                used[j] = 1;
                j = i + 1;
                int choosed = -1;
                int maxE = currentEnd;
                while (j < n && p[j].start == currentEnd) {
                    if (p[j].channel == channel) {
                        if (maxE <= p[j].end) {
                            maxE = p[j].end;
                            choosed = j;
                        }
                    }
                    ++j;
                }
                if (choosed >= 0) {
                    used[choosed] = 1;
                    newEnd = maxE;
                }
                priorityQueue.add(new recorder(newStart, newEnd));
            }

        }
        System.out.println(count);
    }
    public static void main(String [] args) {
        Main main = new Main();
        main.solve();
    }
}
