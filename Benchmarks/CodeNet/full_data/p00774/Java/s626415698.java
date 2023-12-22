import java.util.Scanner;


public class Main{
    static Scanner s = new Scanner(System.in);
    static int score;
    static int[][] puzzle;

    public static void main(String[] args) {
        while (true){
            int H = s.nextInt();
            if(H==0)break;

            score=0;
            puzzle = new int[H][5];
            for(int i=0;i<H;i++){
                for(int j=0;j<5;j++){
                    puzzle[i][j]=s.nextInt();
                }
            }

            while (true) {
                boolean flag = vanish();
                if(!flag) break;
                move();
            }
            System.out.println(score);
        }
    }

    static boolean vanish(){
        boolean flag=false;
        for(int i=0;i<puzzle.length;i++){
            int nowNum=puzzle[i][0];
            int count=1;
            for(int j=1;j<5;j++){
                if(nowNum!=0 && nowNum==puzzle[i][j]){
                    count++;
                } else{
                    if(count>=3){
                        puzzle[i]=erase(puzzle[i],j-1,count,nowNum);
                        flag=true;
                        break;
                    }else{
                        count=1;
                        nowNum=puzzle[i][j];
                    }
                }

                if(j==4 && count>=3){
                    puzzle[i]=erase(puzzle[i],j,count,nowNum);
                    flag=true;
                }
            }
        }
        return flag;
    }

    static int[] erase(int[] puzzleLine,int num,int count,int point){
        for(int i=num;i>num-count;i--){
            puzzleLine[i]=0;
        }
        score+=point*count;
        return puzzleLine;
    }

    static void move(){
        for(int j=0;j<5;j++){
            int temp=puzzle.length-1;
            for(int i=puzzle.length-1;i>=0;i--){
                if(puzzle[i][j]!=0){
                    puzzle[temp][j]=puzzle[i][j];
                    temp--;
                }
            }
            for(int i=temp;i>=0;i--){
                puzzle[i][j]=0;
            }
        }
    }
}