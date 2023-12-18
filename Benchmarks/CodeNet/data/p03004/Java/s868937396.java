import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Po>u=new ArrayList<>();
        ArrayList<Po>d=new ArrayList<>();
        ArrayList<Po>r=new ArrayList<>();
        ArrayList<Po>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            String c=sc.next();
            if(c.equals("D"))d.add(new Po(a,b));
            if(c.equals("L"))l.add(new Po(a,b));
            if(c.equals("R"))r.add(new Po(a,b));
            if(c.equals("U"))u.add(new Po(a,b));
        }
        int uu=Integer.MIN_VALUE,dd=Integer.MAX_VALUE,ll=Integer.MAX_VALUE,rr=Integer.MIN_VALUE;
        int a1=Integer.MIN_VALUE;
        int a2=Integer.MAX_VALUE;
        int ddd,uuu,rrr,lll;
        for(int i=0;i<d.size();i++){
            if(a1<d.get(i).y)a1=d.get(i).y;
            if(a2>d.get(i).y)a1=d.get(i).y;
            
            if(rr<d.get(i).x)rr=d.get(i).x;
            if(ll>d.get(i).x)ll=d.get(i).x;
        }
        if(a1!=Integer.MIN_VALUE){
            ddd=a1-a2;
        }
        a1=Integer.MIN_VALUE;
       a2=Integer.MAX_VALUE;
        else ddd=Integer.MAXVALUE;
        for(int i=0;i<u.size();i++){
            if(a1<u.get(i).y)a1=u.get(i).y;
            if(a2>u.get(i).y)a1=u.get(i).y;
            if(rr<u.get(i).x)rr=u.get(i).x;
            if(ll>u.get(i).x)ll=u.get(i).x;
        }
        if(a1!=Integer.MIN_VALUE){
            uuu=a1-a2;
        }
        a1=Integer.MIN_VALUE;
       a2=Integer.MAX_VALUE;
        for(int i=0;i<r.size();i++){
            if(a1<r.get(i).x)a1=r.get(i).x;
            if(a2>r.get(i).x)a1=r.get(i).x;
            if(uu<r.get(i).y)uu=r.get(i).y;
            if(dd>r.get(i).y)dd=r.get(i).y;
        }
        if(a1!=Integer.MIN_VALUE){
            rrr=a1-a2;
        }
        a1=Integer.MIN_VALUE;
       a2=Integer.MAX_VALUE;
        
        for(int i=0;i<l.size();i++){
            if(a1<l.get(i).x)a1=l.get(i).x;
            if(a2>l.get(i).x)a1=l.get(i).x;
            if(uu<l.get(i).y)uu=l.get(i).y;
            if(dd>l.get(i).y)dd=l.get(i).y;
        }
        if(a1!=Integer.MIN_VALUE){
            lll=a1-a2;
        }
        int ansy=Math.min(lll,rrr);
        int ansx=Math.min(uuu,ddd);
        ansy=Math.min(ansy,uu-dd);
        ansx=Math.min(ansx,rr-ll);
        System.out.println((double)ansy*ansx/4);
        
        
    }
    
}class Po{
        int x,y;String d;
        public Po(int s,int b){
            x=s;
            y=b;
        }
        public void print(){
            System.out.println(x+" "+y+" "+d);
        }
        
    }
