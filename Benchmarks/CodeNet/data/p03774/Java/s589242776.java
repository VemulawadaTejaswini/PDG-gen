

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        Student [] students=new Student[n];
        for (int i = 0; i <n ; i++) {
            students[i]=new Student(in.nextLong(),in.nextLong());
        }
        Point points[]=new Point[m];
        for (int i = 0; i <m ; i++) {
            points[i]=new Point(in.nextLong(),in.nextLong());
        }
        long[]arr=new long[n];

        for (int i = 0; i <n ; i++) {
            long x=Long.MAX_VALUE;
            int val=-1;
            for (int j = 0; j <m ; j++) {
                long dist=Math.abs(students[i].x-points[j].x)+Math.abs(students[i].y-points[j].y);
                if(x>dist){
                    x=dist;
                    val=j;
                }

            }
            arr[i]=val+1;

        }
        for (long e:arr
             ) {
            System.out.println(e);
        }
    }
}
class Student {
    long x,y;
    public Student(long x,long y){
        this.x=x;
        this.y=y;
    }

}
class Point{
    long x,y;
    public Point(long xx,long yy){
        x=xx;
        y=yy;
    }
}