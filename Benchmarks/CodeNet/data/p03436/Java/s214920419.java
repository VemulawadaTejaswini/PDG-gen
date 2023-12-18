
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    Scanner in;
    int rowNum;
    int colNum;
    boolean[][] visited;
    char[][] map;
    Queue<int[]> queue=new LinkedList<int[]>();
    int[][] direction={{0,1},{1,0},{-1,0},{0,-1}};

    Main(){
        in=new Scanner(System.in);

        rowNum=in.nextInt();
        colNum=in.nextInt();

        map=new char[rowNum][colNum];
        visited=new boolean[rowNum][colNum];

        String temp;
        for(int i=0;i<rowNum;i++){
            temp=in.next();
            for(int j=0;j<colNum;j++){
                map[i][j]=temp.charAt(j);
            }
        }

//        for(int i=0;i<rowNum;i++){
//            for(int j=0;j<colNum;j++){
//                System.out.print(map[i][j]);
//            }
//            System.out.println();
//        }
    }

    public int getBarrierNum(){
        int num=0;

        for(int i=0;i<rowNum;i++){
            for(int j=0;j<colNum;j++){
                if(map[i][j]=='#'){
                    num++;
                }
            }
        }

        return num;
    }

    public int bfs(){
        int temp1=1;
        int temp2=0;
        int result=0;
        int[] temp;
        int xtemp;
        int ytemp;

        queue.offer(new int[]{0,0});
        visited[0][0]=true;

        while(true){
            result++;

            for(int i=0;i<temp1;i++){  //层循环
                temp=queue.poll();

                if(temp[0]==rowNum-1 && temp[1]==colNum-1){
                    return result;
                }

                for(int[] k:direction){   //针对一个点的四个方向的循环
                    xtemp=temp[0]+k[0];
                    ytemp=temp[1]+k[1];

                    if(xtemp<0 || xtemp>=rowNum || ytemp<0 || ytemp>=colNum){
                        continue;
                    }
                    else if(map[xtemp][ytemp]=='#'){
                        continue;
                    }
                    else if(visited[xtemp][ytemp]==true){
                        continue;
                    }
                    else{
                        temp2++;
                        visited[xtemp][ytemp]=true;
                        queue.offer(new int[]{xtemp,ytemp});
                    }
                }
            }
            temp1=temp2;
            temp2=0;
        }

    }

    public static void main(String args[]){
        Main m=new Main();
        System.out.println(m.colNum*m.rowNum-m.bfs()-m.getBarrierNum());
    }
}
