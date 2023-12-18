import java.util.Arrays;
import java.util.Scanner;
class Main{

    static void solve(boolean[][] map, boolean trueiswhite){
        System.out.println("96 96");
        for(int i=0;i<96;++i){
            for(int j=0;j<96;++j){
                if(map[i][j]){
                    if(trueiswhite)System.out.print('.');
                    else System.out.print('#');
                }else{
                    if(trueiswhite)System.out.print('#');
                    else System.out.print('.');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        boolean[][] map = new boolean[96][96];
        for(boolean[] m : map)Arrays.fill(m,true);
        boolean trueiswhite = true;
        if(a<b){
            int tmp = a;
            a=b;
            b=tmp;
            trueiswhite=false;
        }

        if(b<16){
            for(int i=0;i<b;++i){
                for(int j=i*6;j<i*6+3;++j){
                    for(int k=0;k<96;++k)map[j][k]=false;
                }
            }
            for(int i=(b-1)*6;i<96;++i)for(int k=0;k<96;++k)map[i][k]=false;
            a-=(b-1);
            for(int i=1;i<96;i+=6){
                for(int j=1;j<96;j+=2){
                    map[i][j]=true;
                    --a;
                    if(a==0){
                        solve(map, trueiswhite);
                        return;
                    }
                }
            }
        }else{
            for(int i=0;i<16;++i){
                for(int j=i*6;j<i*6+3;++j){
                    for(int k=0;k<96;++k)map[j][k]=false;
                }
            }
            b-=16;
            a-=16;
            for(int i=1;i<96;i+=6){
                for(int j=1;j<96;j+=2){
                    map[i][j]=true;
                    --a;
                    if(a==0)break;
                }
                if(a==0)break;
            }

            for(int i=4;i<96;i+=6){
                for(int j=1;j<96;j+=2){
                    map[i][j]=false;
                    --b;
                    if(b==0){
                        solve(map, trueiswhite);
                        return;
                    }
                }
            }

        }


    }
}