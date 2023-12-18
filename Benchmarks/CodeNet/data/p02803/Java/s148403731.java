import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=0,m=0;

        if(scan.hasNext())
            n=scan.nextInt();

        if(scan.hasNext())
            m=scan.nextInt();
        String str="";
        char[][] arr=new char[n][m];
        for(int i=0;i<n;i++){
            if(scan.hasNext())
                str=scan.next();
            arr[i]=str.toCharArray();
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]=='.')
                max=Math.max(max,bfs(arr,i,j));
            }
        }
        System.out.println(max);
    }
    static int bfs(char[][] maze,int i,int j){
        int lev=0;
        boolean[][] brr=new boolean[maze.length][maze[0].length];
        Queue<int[]> q=new ArrayDeque<>();
        q.add(new int[]{i,j,0});

        while(q.size()>0){
            int[] arr=q.poll();
            brr[arr[0]][arr[1]]=true;
            lev=arr[2];
            if(arr[0]-1>=0 && !brr[arr[0]-1][arr[1]] && maze[arr[0]-1][arr[1]]=='.'){
                q.add(new int[]{arr[0]-1,arr[1],arr[2]+1});
            }
            if(arr[0]+1<maze.length && !brr[arr[0]+1][arr[1]] && maze[arr[0]+1][arr[1]]=='.'){
                q.add(new int[]{arr[0]+1,arr[1],arr[2]+1});
            }
            if(arr[1]-1>=0 && !brr[arr[0]][arr[1]-1] && maze[arr[0]][arr[1]-1]=='.'){
                q.add(new int[]{arr[0],arr[1]-1,arr[2]+1});
            }
            if(arr[1]+1<maze[0].length && !brr[arr[0]][arr[1]+1] && maze[arr[0]][arr[1]+1]=='.'){
                q.add(new int[]{arr[0],arr[1]+1,arr[2]+1});
            }
        }
        return lev;
    }
}
