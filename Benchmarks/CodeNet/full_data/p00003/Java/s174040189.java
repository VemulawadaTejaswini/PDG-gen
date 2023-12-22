import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        while(num-->0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if(a==0 && b==0 && c==0) break;

            double[] set = new double[3];
            set[0] = a; set[1] = b; set[2] = c;
            Arrays.sort(set);

            boolean boo = false;
            if(set[0]==set[1] && set[0]*Math.sqrt(2)==set[2]) boo = true;
            if(set[0]*Math.sqrt(3)==set[1] && set[0]*2==set[2]) boo = true;

            for(int i=1; i<=set[2]; i++){
                if(set[0]/i==3 && set[1]/i==4 && set[2]/i==5) boo = true;
                if(set[0]/i==5 && set[1]/i==12 && set[2]/i==13) boo = true;
            }
            if(boo) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}