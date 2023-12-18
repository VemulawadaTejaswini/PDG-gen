import java.util.*;
class Main{
    static void solve(int n[]){

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] c = in.next().toCharArray();
        int temp;
        for(int bit = 0; bit < 8; bit++){
            temp  = c[0] - '0';
            for(int i = 0; i < 3; i++){
                if((bit & (1 << i)) != 0)  temp += c[i+1] - '0';
                else temp -= c[i+1] - '0';
            }
            if(temp == 7){
                System.out.print(c[0]);
                for(int i = 0 ; i < 3; i++){
                    if((bit & (1 << i)) != 0) System.out.print("+" + c[i+1]);
                    else System.out.print("-"+ c[i+1]);
                }
                System.out.println("=7");
                return;
            }
        }
    }
}