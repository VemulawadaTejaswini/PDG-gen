import java.util.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long k=sc.nextLong();
        int l=s.length();
        int x=0;
      	long o=0;
        char a=s.charAt(0);
      	char b;
        boolean p=false;
      
        long o34=Long.MAX_VALUE;
        if(l>1){
            b=s.charAt(1);
          
            for(int i=1;i<l;i++){
                b=s.charAt(i);
                if(a==b && !p){
                    p=true;
                    x++;
                }else{
                    p=false;
                }
                a=b;
            }
            o+=x*k;
            if(!p && b==s.charAt(0)){
                o+=k-1;
            }
          
            int x2=0;
      		long o2=0;
        	char a2=s.charAt(l-1);
      		char b2=s.charAt(l-2);
            boolean p2=false;
            for(int i=l-2;i>=0;i--){
                b2=s.charAt(i);
                if(a2==b2 && !p2){
                    p2=true;
                    x2++;
                }else{
                    p2=false;
                }
                a2=b2;
            }
            o2+=x2*k;
            if(!p2 && s.charAt(0)==s.charAt(l-1)){
                o2+=k-1;
            }
            if(l>=4&& s.charAt(0)==s.charAt(l-1)){
                int x3=1;
                long o3=0;
                char a3=s.charAt(l-1);
                char b3=s.charAt(l-2);
                boolean p3=true;
                for(int i=l-2;i>=0;i--){
                    b3=s.charAt(i);
                    if(a3==b3 && !p3){
                        p3=true;
                        x3++;
                    }else{
                        p3=false;
                    }
                    a3=b3;
                }
                o3+=x3*k;
                if(!p3 && s.charAt(0)==s.charAt(l-1)){
                    o3+=k-1;
                }
                
                    int x4=1;
                    long o4=0;
                    char a4=s.charAt(0);
                    char b4=s.charAt(1);
                    boolean p4=true;
                for(int i=1;i<l;i++){
                    b4=s.charAt(i);
                    if(a4==b4 && !p4){
                        p4=true;
                        x4++;
                    }else{
                        p4=false;
                    }
                    a4=b4;
                }
                o4+=x4*k;
                if(!p && b==s.charAt(0)){
                    o4+=k-1;
                }
              o34=Math.min(o3,o4);
        	}     
          
            o=Math.min(Math.min(o,o2),o34);
        }else{
        	o=k/2;
        }
        System.out.println(o);
    }
}