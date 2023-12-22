import java.io.*;
import java.util.*;

class XY{
    int x;
    int y;
    XY(int x_, int y_){
        x = x_;
        y = y_;
    }
}

class Main{
    void run() throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int num = Integer.parseInt(in.readLine());
            int maxX = 0;
            int maxY = 0;
            int minX = 0;
            int minY = 0;
            if(num == 0)
                break;
            XY[] map = new XY[num];
            map[0] = new XY(0,0);
            maxX = 0;
            maxY = 0;
            minX = 0;
            minY = 0;
            for(int i = 1;i < num;i++){
                String[] str = in.readLine().split(" ",0);
                int kiten = Integer.parseInt(str[0]);
                int houkou = Integer.parseInt(str[1]);

                map[i] = new XY(map[kiten].x, map[kiten].y);
                // System.out.println(map[i].x+":"+map[i].y);
                switch(houkou){
                    case 0:
                        map[i].x -= 1;
                        if(map[i].x < minX){
                            minX = map[i].x;
                        }
                        // System.out.println("minX:"+minX);
                        break;
                    case 1:
                        map[i].y -= 1;
                        if(map[i].y < minY){
                            minY = map[i].y;
                        }
                        // System.out.println("minY:"+minY);
                        break;
                    case 2:
                        map[i].x += 1;
                        if(map[i].x > maxX){
                            maxX = map[i].x;
                        }
                        // System.out.println("maxX:"+maxX);
                        break;
                    case 3:
                        map[i].y += 1;
                        if(map[i].y > maxY){
                            maxY = map[i].y;
                        }
                        // System.out.println("maxY:"+maxY);
                        break;
                }
            }
            int ansX = maxX - minX + 1;
            int ansY = maxY - minY + 1;
            System.out.println(ansX+" "+ansY);
            // for(int i = 0;i < num;i++){
            //     System.out.printf("%d, %d, %d\n", i, map[i].x, map[i].y);
            // }

        }

    }
    public static void main(String[] args) throws IOException{
        Main ma = new Main();
        ma.run();
    }
}