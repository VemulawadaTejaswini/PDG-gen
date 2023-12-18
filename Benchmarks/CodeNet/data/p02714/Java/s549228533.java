import java.io.*;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Match{
    public static int check(ArrayList<Integer> a,ArrayList<Integer> b,ArrayList<Integer> c ){
        int i = 0;
        int j = 0;
        int k = 0;
        int r = 0;
        for (int x=0; x<a.size(); x++) {
            i = a.get(x);
            for (int y=0; y<b.size(); y++) {
                j = b.get(y);
                if( j > i ){
                    for (int z=0; z<c.size(); z++) {
                        k = c.get(z);
                        if( k > j && j - i != k - j ){
                            r ++;
                        }
                    }                                     
                }
            }   
        }
        return r;    
    }
}

class Main{
    public static void main(String args[])
    {
        String buf;
        int num;
        int ans = 0;
        int re =0;
        char r = 'R';
        char g = 'G';
        char b = 'B';
        ArrayList<Integer> red = new ArrayList<Integer>();
        ArrayList<Integer> green = new ArrayList<Integer>();
        ArrayList<Integer> blue = new ArrayList<Integer>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt( br.readLine() );
            buf = br.readLine();

            for(int i = 0; i < buf.length(); i++){
                if( buf.charAt(i) == r){
                    red.add(i);
                }else if( buf.charAt(i) == g){
                    green.add(i);
                }else if( buf.charAt(i) == b){
                    blue.add(i);
                }
            }
            ans += Match.check( red , green , blue );
            ans += Match.check( red  , blue , green );   
            ans += Match.check( blue , green , red );          
            ans += Match.check( blue , red , green ); 
            ans += Match.check( green , blue , red );    
            ans += Match.check( green , red , blue );     
            
            System.out.println(Integer.toString(ans));
        } catch(Exception e) {}
  }
}