import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int[][] ct = new int[2*k+1][2*k+1];
        for(int i=0;i<n;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String c = sc.next();
            boolean isb = true;
            if (c=="W") isb=false;
            int x,y;
            Pair p = Main.translate(new Pair(a,b), isb, k);
            x = p.x;
            y = p.y;
            ct[x][y] ++;
        }
        //cummulative sum
        for(int i=1;i<=2*k;i++){
            for(int j=1;j<=2*k;j++){
                ct[i][j] += ct[i-1][j] + ct[i][j-1] -ct[i-1][j-1];
            }
        }
        CumSum cs = new CumSum(ct);
        //search for maximum
        int answer = 0;
        int ans=0;
        int w = 2*k;
        for(int i=1;i<=2*k;i++){
            for(int j=1;j<=2*k;j++){
                if(i==1){
                    if(j==1){
                        answer = cs.get(1,1,k,k)+cs.get(k+1,k+1,w,w);
                    } else if(j<=k){
                        answer = cs.get(i,j,i+k-1,j+k-1)+cs.get(i+k,1,w,j-1)+cs.get(i+k,j+k,w,w);
                    } else if(j==k+1){
                        answer = cs.get(i,j,i+k-1,w) + cs.get(i+k,1,w,k);
                    } else {
                        answer = cs.get(i,j,k,w) + cs.get(k+1,j-k,w,j-1)+cs.get(1,1,k,j-k-1);
                    }
                } else if(i<=k){
                    if(j==1){
                        answer = cs.get(i,j,i+k-1,j+k-1)+cs.get(1,k+1,i-1,w)+cs.get(i+k,k+1,w,w);
                    } else if(j<=k){
                        answer = cs.get(i,j,i+k-1,j+k-1)+cs.get(1,1,i-1,j-1)+cs.get(1,j+k,i-1,w)+cs.get(i+k,1,w,j-1)+cs.get(i+k,j+k,w,w);
                    } else if(j==k+1){
                        answer = cs.get(i,j,i+k-1,w)+cs.get(1,1,i-1,k)+cs.get(i+k,1,w,k);
                    } else {
                        answer = cs.get(i,j,i+k-1,w)+cs.get(i,1,i+k-1,j-k-1)+cs.get(1,j-k,i-1,j-1)+cs.get(i+k,j-k,w,j-1);
                    }
                } else if(i==k+1){
                    if(j==1){
                        answer = cs.get(i,j,w,k)+cs.get(1,k+1,k,w);
                    } else if(j<=k){
                        answer = cs.get(i,j,w,j+k-1)+cs.get(1,1,i-1,j-1)+cs.get(1,j+k,k,w);
                    } else if(j==k+1){
                        answer = cs.get(1,1,k,k)+cs.get(k+1,k+1,w,w);
                    } else {
                        answer = cs.get(i,j,w,w)+cs.get(i,1,w,j-k-1)+cs.get(1,j-k,i-1,j-1);
                    }
                } else {
                    if(j==1){
                        answer=cs.get(i,j,w,k)+cs.get(1,1,i-k-1,k)+cs.get(i-k,k+1,i-1,w);
                    } else if(j<=k){
                        answer=cs.get(i,j,w,j+k-1)+cs.get(1,j,i-k-1,j+k)+cs.get(i-k,j+k,i-1,w)+cs.get(i-k,1,i-1,j-1);
                    } else if(j==k+1){
                        answer=cs.get(i,j,w,w)+cs.get(1,j,i-k-1,w)+cs.get(i-k,1,i-1,k);
                    } else {
                        answer=cs.get(i,j,w,w)+cs.get(i-k,j-k,i-1,j-1)+cs.get(1,1,i-k-1,j-k-1)+cs.get(1,j,i-k-1,w)+cs.get(i,1,w,j-k-1);
                    }
                }
            if (answer > ans) {
                /*
                System.out.println(i);
                System.out.println(j);
                System.out.println(answer);
                */
                ans = answer;
            }
            }
        }
//        System.out.println("answer:");
        System.out.println(ans);

    }

    public static Pair translate(Pair p, boolean isBlack, int k){
        int x = p.x;
        int y = p.y;
        if(!isBlack) y+=k;
        x = x%(2*k);
        y = y%(2*k);
        if (x==0) x+= 2*k;
        if (y==0) y+= 2*k;
        return new Pair(x,y);
    }
}

class Pair{
    int x;
    int y;
    public Pair(int x,int y) {
        this.x = x;
        this.y = y;
    }
}
class CumSum{
    int[][] ct;
    public int get(int ix,int iy, int fx, int fy){
        return(ct[fx][fy]-ct[ix-1][fy]-ct[fx][iy-1]+ct[ix-1][iy-1]);
    }
    public CumSum(int[][] ct){
        this.ct = ct;
    }

    public static Pair translate(Pair p, boolean isBlack, int k){
        int x = p.x;
        int y = p.y;
        if(!isBlack) y+=k;
        x = x%(2*k);
        y = y%(2*k);
        if (x==0) x+= 2*k;
        if (y==0) y+= 2*k;
        return new Pair(x,y);
    }
}