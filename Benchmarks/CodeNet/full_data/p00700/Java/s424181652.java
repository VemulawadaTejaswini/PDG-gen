Last login: Thu May 30 19:04:59 on ttys000
cmccl04:~ rigaku$ vim Main.java





















cmccl04:~ rigaku$ vim Main.java
cmccl04:~ rigaku$ javac Main.java
Main.java:44: class?Ainterface?A?&#1794;??? enum ??????&#1794;???B
}
^
?G???[ 1 ??
cmccl04:~ rigaku$ vim Main.java
cmccl04:~ rigaku$ javac Main.java
Main.java:13: ?&#1866;????&#770;&#514;??^
???o?l  : java.lang.String
???&#1170;l  : int
	n=kbd.next();
	          ^
?G???[ 1 ??
cmccl04:~ rigaku$ vim Main.java
cmccl04:~ rigaku$ javac Main.java
Main.java:30: ?&#976;? xmax ?&#847;?????????&#258;??&#514;??&#148;\????????&#1794;??B
		if(x>xmax){
		     ^
Main.java:36: ?&#976;? xmax ?&#847;?????????&#258;??&#514;??&#148;\????????&#1794;??B
		System.out.println(xmax+" "+ymax);
		                   ^
Main.java:36: ?&#976;? ymax ?&#847;?????????&#258;??&#514;??&#148;\????????&#1794;??B
		System.out.println(xmax+" "+ymax);
		                            ^
?G???[ 3 ??
cmccl04:~ rigaku$ vim Main.java
cmccl04:~ rigaku$ javac Main.java
cmccl04:~ rigaku$ java Main
1
1 0
-1 0
0 0
1 0
cmccl04:~ rigaku$ java Main
1
2 0
0 1
-1 0
0 1
-1 0
0 -2
0 0
2 1
cmccl04:~ rigaku$ vim sample.txt
cmccl04:~ rigaku$ java Main <sample.txt
6 5
6 5
6 5
cmccl04:~ rigaku$ vim Main.java
cmccl04:~ rigaku$ javac Main.java
cmccl04:~ rigaku$ java Main <sample.txt
6 5
1 0
2 1
cmccl04:~ rigaku$ vim Main.java

public class Main{
        public static void main(String[] args){

        int n;
        int x,y,dx,dy;
        int xmax,ymax;
        int d,dmax;

        Scanner kbd=new Scanner(System.in);

        n=kbd.nextInt();
        x=0;
        y=0;
        d=0;

        for(int i=0; i<n; i++){
        dmax=0;
        xmax=0;
        ymax=0;
        while(true){
           dx=kbd.nextInt();
           dy=kbd.nextInt();
           x+=dx;
           y+=dy;
           d=x*x+y*y;
           if(dmax<d){
              dmax=d;
              xmax=x;
              ymax=y;
           } else if(dmax==d){
                if(x>xmax){
                xmax=x;
                ymax=y;
                }
           }
           if(dx==0 && dy==0){
                System.out.println(xmax+" "+ymax);
                break;
                }
           }
        }

        }
}