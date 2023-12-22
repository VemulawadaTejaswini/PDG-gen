import java.util.Scanner; class Main{
    int a,b;
    public void solve(){
        int x, y = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for(x = a; x <= b; x++){
            if(c % x == 0){
                y++;
            }
        }
        System.out.println(y);
    }
    public static void main(String[] args){
        new Main().solve();
    }
}