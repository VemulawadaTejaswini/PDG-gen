import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        Mods m=new Mods(n+1,1000000007);
        int ans=0;
        int[] ncrs=new int[n];
        for(int i=0;i<n;i++){
            ncrs[i]=m.modNCR(n-1, i);
        }
        for(int i=0;i<n;i++)x[i]=sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                ans=m.modSum(ans, m.modMult(m.modMult(x[j]-x[j-1], m.fact[j-i-1]),m.modMult(m.fact[n-(j-i)-1], ncrs[j-i])));
            }
        }
        System.out.println(ans);
 
    }


}
class Mods {
    private int mod;
    int[] fact;
    //modは十分大きい素数にすること!
    public Mods(int len,int mod){
        fact=new int[len+1];
        fact[0]=fact[1]=1;
        this.mod=mod;
        for(int i=2;i<=len;i++){
            fact[i]=modMult(fact[i-1],i);
        }
    }
    int modSum(int a,int b){
        return (int)(((long)a+(long)b)%mod);
    }
    int modMult(int a,int b){
        return (int)((((long)a*(long)b)%mod+mod)%mod);
    }
    private int pow2(int a,int times){
        if(times==0)return a;
        else return pow2((int)((long)a*(long)a%mod),times-1);
    }
    int modPow(int a,int b){
        int output=1;
        if(b==0)return 1;
        for(int i=0;i<Math.log(b)/Math.log(2)+1;i++){
            if((b&(int)Math.pow(2, i))>0){
                output=modMult(pow2(a,i),output);
            }
        }
        return output;
    }
    int modDivide(int a,int b){
        return modMult(a,modPow(b,mod-2));
    }
    int modNCR(int n,int r){
        if(n<r)return 0;
        if(n==r)return 1;
        return modDivide(modDivide(fact[n],fact[r]),fact[n-r]);
    }
}