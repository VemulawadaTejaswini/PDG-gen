class Main{
    int h=0,m=0,s=0;
    public void solve(){
        int S = 46979;
        h = S / 3600;
        m = (S - h * 3600) / 60;
        s = S - (h * 3600 + m * 60);
        System.out.println(h + ":" + m + ":" + s);
    }
    public static void main(String[] args){
        new Main().solve();     
    }
 
}