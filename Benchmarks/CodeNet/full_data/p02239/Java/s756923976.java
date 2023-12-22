import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

class Main {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] adjacency = new int[n][n];

        for(int i=0; i<n; i++){
            int vIndex = Integer.parseInt(sc.next())-1;
            int nAdj = Integer.parseInt(sc.next());
            for(int j=0; j<nAdj; j++){
                int connectTo = Integer.parseInt(sc.next())-1;
                adjacency[vIndex][connectTo] = 1;
            }
        }

        BFS bfs = new BFS(adjacency);
        bfs.execute();
        bfs.printAnswer(); 
    }


    static class BFS{
        private final  int[][] adjacency;
        private final int[][] ans;
        private final Status[] status;
        private final int np;
        private Queue<Integer> q;

        public int getNp(){
            return this.np;
        }

        public BFS(int[][] adjacency){
            this.adjacency = adjacency;
            this.np = adjacency.length;
            this.ans = new int[adjacency.length][2];
            
            for(int i=0; i<np; i++){
                this.ans[i][0] = i+1;
                this.ans[i][1] = -1;
            }
            this.ans[0][1] = 0;

            Status[] status = new Status[np];
            Arrays.fill(status, Status.NOT_YET);
            status[0] = Status.DONE;
            this.status = status;

            this.q = new ArrayDeque<>();
            this.q.add(0);
        }

        private void searchNotYet(int vi){
            for(int i=0; i<np; i++){
                if( adjacency[vi][i] == 1 && i != vi && this.status[i] == Status.NOT_YET){
                    this.ans[i][1] = this.ans[vi][1]+1;
                    this.q.offer(i);
                    this.status[i] = Status.DONE;
                }
            }
            execute();
        }
        public void execute(){
            while(!this.q.isEmpty()){
                int bottom = this.q.poll();
                searchNotYet(bottom);
            }
        }
        public void printAnswer(){
            for(int i=0; i<np; i++){
                for(int j=0; j<2; j++) {
                    if(j== 1)   System.out.println(ans[i][j]);
                    else System.out.print(ans[i][j]+" ");
                }
            }
        }
    }

    static enum Status{
        DONE,
        CURRENT,
        NOT_YET
    }
}

