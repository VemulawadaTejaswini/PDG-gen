import java.util.Scanner;
import java.util.ArrayList;

class Main{
        public static void main(String args[]){
                Scanner scanner = new Scanner(System.in);
                int N = scanner.nextInt();
                int i;
                //読み込み
                ArrayList<String> names = new ArrayList<String>();
                for(i=0;i<N;i++){
                        names.add(scanner.next());
                }
                Check check = new Check();
                Pick pick = new Pick();
                int M,A,R,C,H;
                ArrayList<Integer> march = new ArrayList<Integer>();
                march = check.sum(names);
                int ans = 1;
                for(i=0;i<march.size();i++)ans *= march.get(i);
                System.out.println(ans);
        }
}

class Check{

        public boolean ini(char s){
                boolean c = (s=='M')||(s=='A')||(s=='R')||(s=='C')||(s=='H');
                return c;
        }

        public ArrayList<Integer> sum(ArrayList<String> names){
                int M=0,A=0,R=0,C=0,H=0;
                Pick pick = new Pick();
                for(int j=0;j<names.size();j++){
                        char s = pick.ini(names.get(j));
                        if(s=='M')M ++;
                        if(s=='A')A ++;
                        if(s=='R')R ++;
                        if(s=='C')C ++;
                        if(s=='H')H ++;
                }
                ArrayList<Integer> march = new ArrayList<Integer>();
                if(M>0)march.add(M);
                if(A>0)march.add(A);
                if(R>0)march.add(R);
                if(C>0)march.add(C);
                if(H>0)march.add(H);
                return march;
        }
}

class Pick{
        public char ini(String s){
                char[] c = s.toCharArray();
                return c[0];
        }
}
