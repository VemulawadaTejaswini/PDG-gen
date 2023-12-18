import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String c=sc.next();
        boolean[] ab=new boolean[a.length()];
        boolean[] ac=new boolean[a.length()];
        boolean[] ba=new boolean[b.length()];
        boolean[] bc=new boolean[b.length()];
        boolean[] ca=new boolean[c.length()];
        boolean[] cb=new boolean[c.length()];
        boolean tmp;
        //ab
        for(int i=0;i<a.length();i++){
            tmp=true;
            for(int j=i;j<a.length()&&j-i<b.length();j++){
                if(!(a.charAt(j)=='?'||b.charAt(j-i)=='?'||a.charAt(j)==b.charAt(j-i))){
                    tmp=false;
                }
            }
            ab[i]=tmp;
        }
        //ac
        for(int i=0;i<a.length();i++){
            tmp=true;
            for(int j=i;j<a.length()&&j-i<c.length();j++){
                if(!(a.charAt(j)=='?'||c.charAt(j-i)=='?'||a.charAt(j)==c.charAt(j-i))){
                    tmp=false;
                }
            }
            ac[i]=tmp;
        }
        //ba
        for(int i=0;i<b.length();i++){
            tmp=true;
            for(int j=i;j<b.length()&&j-i<a.length();j++){
                if(!(b.charAt(j)=='?'||a.charAt(j-i)=='?'||b.charAt(j)==a.charAt(j-i))){
                    tmp=false;
                }
            }
            ba[i]=tmp;
        }
        //bc
        for(int i=0;i<b.length();i++){
            tmp=true;
            for(int j=i;j<b.length()&&j-i<c.length();j++){
                if(!(b.charAt(j)=='?'||c.charAt(j-i)=='?'||b.charAt(j)==c.charAt(j-i))){
                    tmp=false;
                }
            }
            bc[i]=tmp;
        }
        //ca
        for(int i=0;i<c.length();i++){
            tmp=true;
            for(int j=i;j<c.length()&&j-i<a.length();j++){
                if(!(c.charAt(j)=='?'||a.charAt(j-i)=='?'||c.charAt(j)==a.charAt(j-i))){
                    tmp=false;
                }
            }
            ca[i]=tmp;
        }
        //cb
        for(int i=0;i<c.length();i++){
            tmp=true;
            for(int j=i;j<c.length()&&j-i<b.length();j++){
                if(!(c.charAt(j)=='?'||b.charAt(j-i)=='?'||c.charAt(j)==b.charAt(j-i))){
                    tmp=false;
                }
            }
            cb[i]=tmp;
        }
        int ans=Integer.MAX_VALUE;
        //abc
        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(ab[i]&&bc[j]&&(ac.length-1<=i+j||ac[i+j])){
                    ans=Math.min(ans, Math.min(a.length(),Math.min(i+b.length(),i+j+c.length())));
                }
            }
        }
        //acb
        for(int i=0;i<a.length();i++){
            for(int j=0;j<c.length();j++){
                if(ac[i]&&cb[j]&&(ab.length-1<=i+j||ab[i+j])){
                    ans=Math.min(ans, Math.min(a.length(),Math.min(i+c.length(),i+j+b.length())));
                }
            }
        }
        //bac
        for(int i=0;i<b.length();i++){
            for(int j=0;j<a.length();j++){
                if(ba[i]&&ac[j]&&(bc.length-1<=i+j||bc[i+j])){
                    ans=Math.min(ans, Math.min(b.length(),Math.min(i+a.length(),i+j+c.length())));
                }
            }
        }
        //bca
        for(int i=0;i<b.length();i++){
            for(int j=0;j<c.length();j++){
                if(bc[i]&&ca[j]&&(ba.length-1<=i+j||ba[i+j])){
                    ans=Math.min(ans, Math.min(b.length(),Math.min(i+c.length(),i+j+a.length())));
                }
            }
        }
        //cab
        for(int i=0;i<c.length();i++){
            for(int j=0;j<a.length();j++){
                if(ca[i]&&ab[j]&&(cb.length-1<-i+j||cb[i+j])){
                    ans=Math.min(ans, Math.min(c.length(),Math.min(i+a.length(),i+j+b.length())));
                }
            }
        }
        //cba
        for(int i=0;i<c.length();i++){
            for(int j=0;j<b.length();j++){
                if(cb[i]&&ba[j]&&(ca.length-1<=i+j||ca[i+j])){
                    ans=Math.min(ans, Math.min(c.length(),Math.min(i+b.length(),i+j+a.length())));
                }
            }
        }
        System.out.println(ans);
        
 
    }



}