import java.util.*;
import java.io.*;
class Main {
    static class Line {
        long slope;
        long intercept;
        Line(long slope, long intercept) {
            this.slope = slope;
            this.intercept = intercept;
        }
        long getValue(int x) {
            return this.slope * 1l * x + this.intercept;
        }
        long[] intersection(Line other) {
            long one = other.intercept - this.intercept;
            long two = this.slope - other.slope;
            if(two<0) {
                two = -two;
                one = -one;
            }
            return new long[]{one, two};
        }
    }
    static long square(int a) {
        return a*1l*a;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c = sc.nextLong();
        int[] heights = new int[n];
        for(int i = 0; i<n; i++)
            heights[i] = sc.nextInt();
        List<Line> deque = new ArrayList<>();
        int start = 0;
        for(int i = 0; i<n; i++) {
            while(start<=deque.size()-2) {
                Line a = deque.get(start);
                Line b = deque.get(start+1);
                if(a.getValue(heights[i])>=b.getValue(heights[i]))
                    start++;
                else break;
            }
            long best = 0;
            if(i!=0)
                best = deque.get(start).getValue(heights[i]) + square(heights[i]) + c;
            Line line = new Line(-2*1l*heights[i], best+square(heights[i]));
            while(start<=deque.size()-2) {
                Line a = deque.get(deque.size()-1);
                Line b = deque.get(deque.size()-2);
                long[] first = a.intersection(b);
                long[] second = b.intersection(line);
                if(first[0]*second[1]>=first[1]*second[0])
                    deque.remove(deque.size()-1);
                else break;
            }
            deque.add(line);
            if(i==n-1)
                System.out.println(best);
        }
    }
}