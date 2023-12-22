import java.util.*;

public class Main{
    Scanner in = new Scanner(System.in);

    int simulate(){
        int a = 0, b = 0, c = 0, out = 0, point = 0;
        while(out < 3){
            String s = in.nextLine();
            switch(s){
                case "HIT":
                    point += c;
                    c = b;
                    b = a;
                    a = 1;
                break;
                case "HOMERUN":
                    point += a + b + c + 1;
                    a = b = c = 0;
                break;
                case "OUT":
                    out++;
                break;
            }
        }
        return point;
    }

    void solve(){
        int n = getInt();
        for(int i = 0; i < n; i++){
            System.out.println(simulate());
        }
    }
    
    public static void main(String[] args){
        new Main().solve();    
    }

    int getInt(){
        return Integer.parseInt(in.nextLine());
    }
}