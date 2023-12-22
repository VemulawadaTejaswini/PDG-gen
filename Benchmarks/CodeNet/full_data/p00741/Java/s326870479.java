import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h, w, x, y, count,finish=0,xxx=0;
        int[] movex = {1,-1,0,0,1,-1,1,-1}, movey = {0,0,1,-1,1,-1,-1,1};
        while(true){
            count = 0;
            w = sc.nextInt();
            h = sc.nextInt();
            if(w == 0 && h==0) break;
            int[][] search = new int[h+2][w+2];
            int[][] c = new int[h+2][w+2];
            for(int i=1;i<=h;i++){
                for(int j=1;j<=w;j++){
                    c[i][j] = sc.nextInt();
                }
            }
            /*for(int i=0;i<h+2;i++){
                for(int j=0;j<w+2;j++){
                    System.out.print(c[i][j]);
                }
                System.out.println();
            }*/
            Stack<Integer> map = new Stack<Integer>();
            do{
                outer:
                for(int i=1;i<=h;i++){
                    for(int j=1;j<=w;j++){
                        if(search[i][j] == 0 && c[i][j] == 1){
                            if(map.empty()){
                                int n = i*10+j;
                                map.push(n);
                                search[i][j] = 1;
                                count++;
                                break outer;
                            }
                        }
                    }
                }
                while(!map.empty()){
                    int n = map.pop();
                    x = n/10;
                    y = n%10;
                    for(int i=0;i<8;i++){
                        if(c[x+movex[i]][y+movey[i]] == 1 && search[x+movex[i]][y+movey[i]] == 0){
                            map.push((x+movex[i])*10+(y+movey[i]));
                            search[x+movex[i]][y+movey[i]] = 1;
                        }
                    }
                }
                xxx++;
            }while(xxx<h*w);
            System.out.println(count);
        }
    }
}
