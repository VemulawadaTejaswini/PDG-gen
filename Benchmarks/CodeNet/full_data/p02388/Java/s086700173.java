import java.util.Scanner;

class Main{
    int x, y;
    
    public void solve(){
        int a, b;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = x*x*x;
        
        System.out.println(y);
                
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
    
}