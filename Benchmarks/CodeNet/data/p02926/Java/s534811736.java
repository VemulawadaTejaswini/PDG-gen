import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Pair {
    long x;
    long y;
    Pair(long u, long v) {
        x = u;
        y = v;
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Pair p1 = new Pair(0,0);
        Pair p2 = new Pair(0,0);
        Pair p3 = new Pair(0,0);
        Pair p4 = new Pair(0,0);
        for(int i=0 ; i<n ; i++) {
            st = new StringTokenizer(br.readLine());
            int xi = Integer.parseInt(st.nextToken());
            int yi = Integer.parseInt(st.nextToken());

            if(xi >=0 && yi >=0) {
                //First Quad
                p1.x+=xi;
                p1.y+=yi;
                if(Math.sqrt(Math.pow(p2.x+xi,2) + Math.pow(p2.y+yi,2)) >= Math.sqrt((Math.pow(p2.x,2) + Math.pow(p2.y,2)))) {
                    p2.x += xi;
                    p2.y += yi;
                }
                if(Math.sqrt(Math.pow(p4.x+xi,2) + Math.pow(p4.y+yi,2)) >= Math.sqrt((Math.pow(p4.x,2) + Math.pow(p4.y,2)))) {
                    p4.x += xi;
                    p4.y += yi;
                }
            }
            else if(xi >=0 && yi <=0) {
                //Fourth Quad
                p4.x+=xi;
                p4.y+=yi;
                if(Math.sqrt(Math.pow(p1.x+xi,2) + Math.pow(p1.y+yi,2)) >= Math.sqrt((Math.pow(p1.x,2) + Math.pow(p1.y,2)))) {
                    p1.x += xi;
                    p1.y += yi;
                }
                if(Math.sqrt(Math.pow(p3.x+xi,2) + Math.pow(p3.y+yi,2)) >= Math.sqrt((Math.pow(p3.x,2) + Math.pow(p3.y,2)))) {
                    p3.x += xi;
                    p3.y += yi;
                }
            }
            else if(xi <=0 && yi >=0) {
                //Second Quad
                p2.x += xi;
                p2.y += yi;
                if(Math.sqrt(Math.pow(p1.x+xi,2) + Math.pow(p1.y+yi,2)) >= Math.sqrt((Math.pow(p1.x,2) + Math.pow(p1.y,2)))) {
                    p1.x += xi;
                    p1.y += yi;
                }
                if(Math.sqrt(Math.pow(p3.x+xi,2) + Math.pow(p3.y+yi,2)) >= Math.sqrt((Math.pow(p3.x,2) + Math.pow(p3.y,2)))) {
                    p3.x += xi;
                    p3.y += yi;
                }
            }
            else {
                //Third Quad
                p3.x+=xi;
                p3.y+=yi;
                if(Math.sqrt(Math.pow(p2.x+xi,2) + Math.pow(p2.y+yi,2)) >= Math.sqrt((Math.pow(p2.x,2) + Math.pow(p2.y,2)))) {
                    p2.x += xi;
                    p2.y += yi;
                }
                if(Math.sqrt(Math.pow(p4.x+xi,2) + Math.pow(p4.y+yi,2)) >= Math.sqrt((Math.pow(p4.x,2) + Math.pow(p4.y,2)))) {
                    p4.x += xi;
                    p4.y += yi;
                }
            }
        }

        double max = 0;
        max = Math.max(max, Math.sqrt(Math.pow(p1.x,2) + Math.pow(p1.y,2)));
        max = Math.max(max, Math.sqrt(Math.pow(p2.x,2) + Math.pow(p2.y,2)));
        max = Math.max(max, Math.sqrt(Math.pow(p3.x,2) + Math.pow(p3.y,2)));
        max = Math.max(max, Math.sqrt(Math.pow(p4.x,2) + Math.pow(p4.y,2)));

        System.out.println(max);
    }
}
