import java.util.*;

class Main{

    char[] in;
    int p;

    void solve(){
        Scanner sc = new Scanner(System.in);

        in = sc.next().toCharArray();
        p = 0;

        boolean boo = cat();
        if(boo && p>=in.length) System.out.println("Cat");
        else System.out.println("Rabbit");
    }

    boolean cat(){
        if(p<in.length && in[p]=='m'){
            p++;
            if(p<in.length && in[p]!='e'){
                if(!cat()) return false;
            }
        }

        if(p<in.length && in[p]=='e'){
            p++;
            if(p<in.length && in[p]!='w'){
                if(!cat()) return false;
            }
        }
        
        if(p<in.length && in[p]=='w'){
            p++;
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}