import java.util.*;

@SuppressWarnings("unchecked")
class Main{

    char[] in;
    boolean[][] checked;
    HashSet[][] memo;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            String s = sc.next();
            if(s.equals("#")) break;

            in = s.toCharArray();
            int n = in.length+1;
            checked = new boolean[n][n];
            memo = new HashSet[n][n];
            System.out.println(expr(0, in.length).size());
        }
    }

    HashSet<Integer> expr(int l, int r){
        if(checked[l][r]) return memo[l][r];
        int depth = 0;
        HashSet<Integer> res = new HashSet<Integer>();

        for(int i=l; i<r; i++){
            if(in[i]=='(') depth++;
            if(in[i]==')') depth--;
            if((in[i]=='*' || in[i]=='/' || in[i]=='+' || in[i]=='-') && depth==0){
                HashSet<Integer> left = expr(l, i);
                HashSet<Integer> right = expr(i+1, r);

                for(Iterator j=left.iterator(); j.hasNext();){
                    int a = (int)j.next();
                    for(Iterator k=right.iterator(); k.hasNext();){
                        int b = (int)k.next();
                        if(in[i]=='*') res.add(a * b);
                        if(in[i]=='/' && b!=0) res.add(a / b);
                        if(in[i]=='+') res.add(a + b);
                        if(in[i]=='-') res.add(a - b);
                    }
                }
            }
        }
        if(res.size()==0) res.add(digit(l, r));

        checked[l][r] = true;
        return memo[l][r] = res;
    }

    int digit(int l, int r){
        int res = 0;
        int ten = r-l;
        for(int i=l; i<r; i++){
            res += (in[i]-'0') * ten--;
        }
        return res;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}