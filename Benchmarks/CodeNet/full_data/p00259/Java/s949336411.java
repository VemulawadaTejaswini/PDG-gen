import java.util.*;

class Main{
    
    int INF=1<<28;
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
                //String s = "";
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
        while(p<in.length && Character.isDigit(in[p])) res = (res * 10 + in[p++] - '0')%pp;
        return res;
    }
 
    int calc(int a,int b,char op){
        //if(debug)System.out.printf("a=%d b=%d op=%s pp=%d p=%d\n",a,b,op,pp,p);
        if(op=='/' && b==0){return INF;}
     
        //while(a<0)a+=pp;while(b<0)b+=pp;
        //a%=pp;b%=pp;
 
        int val=-1;
        switch(op){
        case '+':{val=(a+b)%pp;break;}
        case '-':{
            for(int m=0; m<pp; m++){
                if((b+m)%pp==0){
                    val = (a+m)%pp;
                    break;
                }
            }
            break;
            //val=(a-b)%pp;break;
        }
        case '*':{val=(a*b)%pp;break;}
        case '/':{
            int d=-1;
            for(int i=0;i<pp;i++){
                if((i*b)%pp==1){d=i;break;}
            }
            val=(a*d)%pp;
        }
        }
        
        //while(val<0)val+=pp;
        //  if(debug)System.out.printf("val=%d\n",val);
        return val%pp;
    }
 
 
    public static void main(String[] args){
        new Main().solve();
    }
}