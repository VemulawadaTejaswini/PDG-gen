import java.util.*;
import java.io.*;

  class Main {
    
    static char[][] mat;
    
    public static boolean check(int x, int y) { return (x >= 0 && x < mat.length && y>=0 && y<mat[0].length); }
    
    public static void print(int[][] dis){
        for(int i = 0; i < dis.length; i++) System.out.println(Arrays.toString(dis[i]));
    }
    
   
    
    public static void solve(int x, int y, int end_x, int end_y){
        Comparator<Node> c = Comparator.comparing(Node :: getCost);
       
        PriorityQueue<Node> q = new PriorityQueue(c);
        
        int[][] dis = new int[mat.length][mat[0].length];
        
        q.add(new Node(x,y,0));
        
        for(int i = 0; i < dis.length; i++)
            Arrays.fill(dis[i],Integer.MAX_VALUE);
    
        dis[x][y] = 0;
        
        boolean[][] visited = new boolean[mat.length][mat[0].length];
    
        
        while(!q.isEmpty()){
            Node pop = q.poll();
            visited[pop.x][pop.y] = true;
          //  System.out.println(pop.x + " " + pop.y + " -> ");
            int[] dx = {1,-1,0,0};
            int dy[] = {0,0,1,-1};
            
            // put neighbours
            for(int i = 0; i < dx.length; i++){
                int newX = pop.x + dx[i];
                int newY = pop.y + dy[i];
                if(check(newX,newY) && mat[newX][newY] == '.' && !visited[newX][newY]){
                    // add it with 0 cost
                    int newDis = 0;
                    if(dis[newX][newY] > dis[pop.x][pop.y] + 0){
                        dis[newX][newY] = dis[pop.x][pop.y] ;
                        q.add(new Node(newX,newY,dis[pop.x][pop.y]));
                    }
                }
                
            }
            
            
            /// add magic wala scene
            
                      for(int newX = pop.x-2; newX <= pop.x+2; newX++){
                          for(int newY = pop.y-2; newY <= pop.y+2; newY++){
                              if(check(newX,newY) && mat[newX][newY] == '.' && !visited[newX][newY]){
                                // add it with 0 cost
                                int newDis = 0;
                                if(dis[newX][newY] > dis[pop.x][pop.y] + 1){
                                    dis[newX][newY] = dis[pop.x][pop.y] + 1;
                                    q.add(new Node(newX,newY,dis[pop.x][pop.y] + 1));
                                }
                            }
                          }
                          
                      }
            
            
            
               
        }
        if(dis[end_x][end_y] == Integer.MAX_VALUE)
            System.out.println(-1);
        else
           System.out.println(dis[end_x][end_y]);
        //print(dis);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        int row = Integer.parseInt(in[0]);
        int col = Integer.parseInt(in[1]);
        
        
        in = br.readLine().trim().split(" ");
        int start_x = Integer.parseInt(in[0]);
        int start_y = Integer.parseInt(in[1]);
        
        in = br.readLine().trim().split(" ");
        
        int end_x = (Integer.parseInt(in[0]));
        int end_y = (Integer.parseInt(in[1]));
      
        mat = new char[row][col];
        
        
        for(int i = 0; i < row; i++){
            mat[i] = br.readLine().trim().toCharArray();
        }
        
        solve(start_x-1,start_y-1,end_x-1,end_y-1);
    }
}



class Node {
    int x;
    int y;
    int cost;
    Node(int x, int y, int cost){
        this.x = x;
        this.y = y;
        this.cost = cost;
    }
    int getCost() {return this.cost;}
}

