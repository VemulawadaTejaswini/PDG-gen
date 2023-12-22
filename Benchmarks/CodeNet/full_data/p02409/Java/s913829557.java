import java.util.Scanner;
class Main{
    int n,x,y,c;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\s");
        n = sc.nextInt();
        int a[][] = new int [12][10];
        for(x = 0; x < 12; x++){
            for(y = 0; y < 10; y++){
                a[x][y] = 0;
            }
        }
        
        for(x = 0; x < n; x++){
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();
            if(b == 1){
                a[f-1][r-1] += v;
            }else if(b == 2){
                a[f+2][r-1] += v;
            }else if(b == 3){
                a[f+5][r-1] += v;
            }else if(b == 4){
                a[f+8][r-1] += v;
            }else{
                continue;
            }
        }
        for(y = 0; y < 12; y++){
            for(c = 0; c < 10; c++){
                System.out.printf(" %d",a[y][c]);
            }
            System.out.println();      
            if(y % 3 == 2 && y != 11){
                System.out.println("####################");
            }
        }
    }
    public static void main(String[] args){
        new Main().solve();
    }
}