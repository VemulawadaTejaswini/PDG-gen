
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<int[]> q1= new ArrayList<>();
        List<int[]> q2= new ArrayList<>();
        List<int[]> q3= new ArrayList<>();
        List<int[]> q4= new ArrayList<>();
        int n= in.nextInt();
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            int y=in.nextInt();

            if(x>=0 && y>=0)
                q1.add(new int[]{x,y});
            else
                if(x>=0 && y<=0)
                    q2.add(new int[]{x,y});
                else
                    if(x<=0 && y>=0)
                        q3.add(new int[]{x,y});
                        else
                            if(x<=0 && y<=0)
                                q4.add(new int[]{x,y});
        }
        long dist=0, x=0,y=0;
        double max=Long.MIN_VALUE;
        for(int[] p: q1){
            x+=p[0];
            y+=p[1];
        }
        //System.out.println("x: " + x + " y: "+y);
        max=Math.max(max, Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
        x=0;y=0;
        for(int[] p: q2){
            x+=p[0];
            y+=p[1];
        }
       // System.out.println("x: " + x + " y: "+y);
        max=Math.max(max, Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
        x=0;y=0;
        for(int[] p: q3){
            x+=p[0];
            y+=p[1];
        }
        //System.out.println("x: " + x + " y: "+y);
        max=Math.max(max, Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
        x=0;y=0;
        for(int[] p: q3){
            x+=p[0];
            y+=p[1];
        }
        //System.out.println("x: " + x + " y: "+y);
        max=Math.max(max, Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
        System.out.println(max);

    }
}
