import java.util.*;

class Main{
    
    int INF=Integer.MAX_VALUE;
    boolean debug=false;
    
    char[] in;
    int pp; // prime
    int p; // in[p]
    
    void solve(){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String[] line = sc.nextLine().split(":");
            if(line[0].equals("0")) break;
            
            pp = Integer.parseInt(line[0]);
            
            int cnt = 0;
            for(int i=0; i<line[1].length(); i++){
                if(line[1].charAt(i)!=' ') cnt++;
            }
            
            in = new char[cnt];
            p = 0;
            int idx = 0;
            for(int i=0; i<line[1].length(); i++){
                if(line[1].charAt(i)!=' ') in[idx++] = line[1].charAt(i);
            }
            
            int ans = expr();
            if(ans==INF) System.out.println("NG");
            else{
                StringBuffer sb = new StringBuffer();
                for(int i=0; i<in.length; i++){
                    sb.append(in[i]);
                }
                sb.append(" = " + ans + " (mod "+pp+")");
                System.out.println(sb.toString());
            }
        }
    }
    
    int expr(){
        int a = term();
        if(a==INF){
            p = in.length;
            return INF;
        }
        while(true){
            if(p>=in.length || (in[p]!='+' && in[p]!='-')) break;
            boolean add = in[p++] == '+';
            
            int b = term();
            if(b==INF){
                p = in.length;
                return INF;
            }
            if(add) a = calc(a, b, '+');
            else a = calc(a, b, '-');
        }
        return a;
    }
    
    int term(){
        int a = factor();
        if(a==INF){
            p = in.length;
            return INF;
        }
        while(true){
            if(p>=in.length || (in[p]!='*' && in[p]!='/')) break;
            boolean mul = in[p++] == '*';
            
            int b = factor();
            if(b==INF){
                p = in.length;
                return INF;
            }
            if(mul) a = calc(a, b, '*');
            else{
                if(b==0){
                    p = in.length;
                    return INF;
                }
                else a = calc(a, b, '/');
            }
        }
        return a;
    }
    
    int factor(){
        if(p<in.length && in[p]=='('){
            p++;
            int res = expr();
            p++;
            return res;
        }else return digit();
    }
 
    int digit(){
        int res = 0;
        while(p<in.length && Character.isDigit(in[p])) res = (res * 10 + in[p++] - '0') % pp;
        return res;
    }
 
    int calc(int a,int b,char op){
        if(op=='/' && b==0){return INF;}
     
        int val=-1;
        switch(op){
        case '+':{val = (a+b) % pp; break;}
        case '-':{val = (a+(pp-b)) % pp;  break;}
        case '*':{val = (a*b) % pp; break;}
        case '/':{val = a * pow(b, pp-2) % pp;}
        }
        
        return val % pp;
    }
 
    int pow(int b, int po){
        if(po==1) return b;
        int a = pow(b, po/2) % pp;
        if(po%2==1) return a * a % pp * b % pp;
        else return a * a % pp;
    }
 
    public static void main(String[] args){
        new Main().solve();
    }
}