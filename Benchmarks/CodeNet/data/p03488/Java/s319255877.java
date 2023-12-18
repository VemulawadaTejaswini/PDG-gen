import java.io.*;
import java.util.*;

class Main {
    int x, y;
    boolean ans = false;
    String[] input;
    public void calc(int nowx, int nowy, int nowIndex, boolean rightLeft, int nowAngle){
        // Arrays.asList(input).subList(nowIndex, input.length).stream().forEach(System.out::println);
        // System.out.println("");
        for(String s: Arrays.asList(input).subList(nowIndex, input.length)) {
            if(s.equals("T")){
                // rightの場合
                if(rightLeft){
                    // System.out.println("right!");
                    nowAngle += 1;
                    if(nowAngle == 4){
                        nowAngle = 0;
                    }
                } else {
                    // System.out.println("left!");
                    nowAngle -= 1;
                }
                nowIndex++;
                calc(nowx, nowy, nowIndex, rightLeft, nowAngle);
                calc(nowx, nowy, nowIndex, !rightLeft, nowAngle);
            } else {
                if(nowAngle == 0){
                    nowy += 1;
                } else if(nowAngle == 1){
                    nowx += 1;
                } else if(nowAngle == 2){
                    nowy -= 1;
                } else if(nowAngle == 3){
                    nowx -= 1;
                }
                nowIndex++;
            }
        }
        // System.out.println(nowx + " " + nowy);
        if(nowx == x && nowy == y) {
            ans = true;
            return;
        }
    }

    public void run() throws Exception {
        Scanner sc = new Scanner(System.in);
        input = sc.next().split("");
        int nowx, nowy = 0;
        x = sc.nextInt();
        y = sc.nextInt();
        calc(0, 0, 0, true, 1);
        calc(0, 0, 0, false, 1);
        if(ans){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String... args) throws Exception{
        new Main().run();
    }
}
