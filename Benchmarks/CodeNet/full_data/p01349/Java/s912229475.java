import java.util.*;

class Main{

    int h, w, n;
    char[][] board, board2;
    String[] s;
    boolean change;

    void solve(){
        Scanner sc = new Scanner (System.in);

        h = sc.nextInt();
        w = sc.nextInt();
        n = sc.nextInt();

        s = new String[h];
        for(int i=0; i<h; i++) s[i] = sc.next();

        boolean cake = false;
        for(int i=0; i<h; i++){
            for(int j=0; j<w-1; j++){
                board = new char[h][w];
                board2 = new char[h][w];
                for(int l=0; l<h; l++){
                    board[l] = s[l].toCharArray();
                    board2[l] = s[l].toCharArray();
                }

                if(board[i][j]==board[i][j+1]) {
                    continue;
                }
                             
                char tmp = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = tmp;
                board2[i][j] = board[i][j];
                board2[i][j+1] = board[i][j+1];
        
                //for(int l=0; l<h; l++) System.out.println("b "+String.valueOf(board[l]));

                cake();

                cake = true;
                for(int k=0; k<h; k++){
                    for(int l=0; l<w; l++){
                        if(board[k][l]!='.'){
                            cake = false;
                            break;
                        }
                    }
                    if(!cake) break;
                }
                if(cake){
                    //System.out.println(i+" "+j);
                    break;
                }
            }
            if(cake) break;
        }

        if(cake) System.out.println("YES");
        else System.out.println("NO");
    }

    void cake(){

        change = false;
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(board[i][j]!='.'){
                    //for(int l=0; l<h; l++) System.out.println("bb "+String.valueOf(board[l]));

                    bfs(i, j); 
                    //for(int l=0; l<h; l++) System.out.println("aa "+String.valueOf(board[l]));

                    delete();
                }
            }
        }

        if(change){
            change = false;
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    board2[i][j] = board[i][j];
                }
            }
            cake();
        }
    }

    //1 : same , 2 : delete
    void delete(){
        for(int k=0; k<h; k++){
            int start = 0, goal = 0;
            while(true){
                boolean boo = false;
                while(start<w && board[k][start]!='1'){
                    start++;
                }
                if(start>=w) {
                    break;
                }
                goal = start+1;
                if(goal>=w || board[k][goal]!='1') break;
                while(goal+1<w && board[k][goal+1]=='1') goal++;
                if(goal>=w) break;

                if(goal-start+1>=n){
                    change = true;
                    boo = true;
                    //System.out.println("poyo-");
                    for(int l=start; l<=goal; l++) board[k][l] = '2';
                }
                start = goal+1;
                if(!boo || start>=w) break;
            }
        }

        //for(int i=0; i<h; i++) System.out.println("xx "+String.valueOf(board[i]));
        
        for(int k=0; k<w; k++){
            int start = 0, goal = 0;
            while(true){
                boolean boo = false;
                while(start<h && !(board[start][k]=='1' || board[start][k]=='2')){
                    start++;
                }
                //System.out.println(k+" "+start);
                if(start>=h) break;
                goal = start+1;
                if(goal>=h || (board[goal][k]!='1' && board[goal][k]!='2')) break;
                while(goal+1<h && (board[goal+1][k]=='1' || board[goal+1][k]=='2')) goal++;
                if(goal>=h) break;

                //System.out.println(k+" "+start+" "+goal+" "+n);


                if(goal-start+1>=n){
                    change = true;
                    boo = true;
                    for(int l=start; l<=goal; l++) board[l][k] = '2';
                }
                start = goal+1;
                if(!boo || start>=h) break;
            }
        }

        //for(int i=0; i<h; i++) System.out.println("zz "+String.valueOf(board[i]));
        
        LinkedList<Character> list = new LinkedList<Character>();
        for(int k=0; k<w; k++){
            for(int l=h-1; l>=0; l--){
                if(board[l][k]=='2' || board[l][k]=='.') list.add('.');
                else if(board[l][k]=='1'){
                    board[l][k] = board2[l][k];
                    list.addFirst(board[l][k]);
                }else list.addFirst(board[l][k]);
            }
            for(int l=h-1; l>=0; l--) board[l][k] = list.pollFirst();
        }

        //for(int i=0; i<h; i++) System.out.println("dd "+String.valueOf(board[i]));
    }
    
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    void bfs(int y, int x){
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{y, x});
        boolean[][] v = new boolean[h][w];
        v[y][x] = true;

        while(q.size()>0){
            int[] pp = q.poll();
            int yy = pp[0], xx = pp[1];

            for(int i=0; i<4; i++){
                int ny = yy + dy[i], nx = xx + dx[i];
                if(ny<0 || ny>=h || nx<0 || nx>=w) continue;

                if(board[ny][nx]==board[y][x] && !v[ny][nx]){
                    board[ny][nx] = '1';
                    v[ny][nx] = true;
                    q.add(new int[]{ny, nx});
                }
            }
        }
        board[y][x] = '1';
    }

    public static void main(String[] args){
        new Main().solve();
    }
}