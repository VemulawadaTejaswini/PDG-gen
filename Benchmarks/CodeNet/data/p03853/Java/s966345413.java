import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        
        
        ArrayList<String> s_list = new ArrayList<String>();
        for(int i=0; i<H; i++){
            s_list.add(sc.next());
        }
        
        for(int i=0; i<H*2; i++){
            System.out.println(s_list.get(i/2));
        }
        
    }
}