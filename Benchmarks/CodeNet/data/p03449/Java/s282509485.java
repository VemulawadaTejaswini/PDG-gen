import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class Main {
    
    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         n = 2;
         m = input.nextInt();
        Pair [][] pairses = new Pair[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pairses[i][j] = new  Pair(i, j, input.nextInt(), 0);
            }
        }
        bfs(pairses[0][0], pairses);
        System.out.println(pairses[1][m-1].sum + pairses[1][m-1].value);
    }
    
    public static void bfs (Pair pair, Pair [][] pairses){
        Queue<Pair> pairs = new LinkedList<>();
         pairs.add(pair);
         
         while (!pairs.isEmpty()) {
             
             Pair p = pairs.poll();

             if (check(p.x + 1, p.y) && (p.value + p.sum > pairses[p.x + 1][p.y].sum || p.value + p.sum ==  pairses[p.x + 1][p.y].sum && !pairses[p.x + 1][p.y].add) ) {
                 pairses[p.x + 1][p.y].sum = p.value + p.sum;
                 pairs.add(pairses[p.x + 1][p.y]);
                 pairses[p.x + 1][p.y].add = true;
                 
             }
              
              if (check(p.x, p.y + 1) &&(p.value + p.sum > pairses[p.x][p.y+1].sum || p.value + p.sum ==  pairses[p.x ][p.y +1].sum && !pairses[p.x ][p.y+1 ].add)) {
                 pairses[p.x][p.y+1].sum = p.value + p.sum ;
                 pairs.add(pairses[p.x][p.y + 1]);
                 pairses[p.x][p.y + 1].add = true;
             }
        }
    
       
    }
    
    
    public static boolean check (int x, int y){
        
        return x > -1 && x < n && y > -1 && y < m;  
    }
}


class Pair{
    int x;
    int y;
    int value;
    int sum;
    
    boolean add;

    public Pair(int x, int y, int value, int sum) {
        this.x = x;
        this.y = y;
        this.value = value;
        this.sum = sum;
    }

}

