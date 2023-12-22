import java.util.Scanner;
class Main{
    int f,r,m,x,y;
    boolean a;
    String b;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\s");
        while(a == false){
            m = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();
            if(m == -1 && f == -1 && r == -1){
                a = true;
                break;
            }else if(m == -1 || f == -1){
                b = "F";
            }else if(m + f >= 80){
                b = "A";
            }else if(m + f >= 65){
                b = "B";
            }else if(m + f >= 50){
                b = "C";
            }else if(m + f >= 30 && r >= 50){
                b = "C";
            }else if(m + f >= 30){
                b = "D";
            }else{
                b = "F";
            }
            System.out.println(b);
        }
    }
    public static void main(String[] args){
        new Main().solve();
    }
}