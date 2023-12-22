import java.util.*;

public class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break; 

            ArrayList<Integer> list = new ArrayList<Integer>();
            while(n>0){
                list.add(n%8);
                n /= 8;
            }

            for(int i=list.size()-1; i>=0; i--){
                int num = list.get(i);
                if(num>=4) num++;
                if(num>=6) num++;
                System.out.print(num);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}