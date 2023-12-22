import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        String find = sc.next();
        int n = sc.nextInt();
        int count = 0;

        for(int i=0; i<n; i++){
            String ring = sc.next();
            ring += ring;
            if(ring.contains(find)) count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}