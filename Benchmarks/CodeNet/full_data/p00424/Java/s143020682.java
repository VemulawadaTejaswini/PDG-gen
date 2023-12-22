import java.util.*;

public class Main {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        while(true){
            int n =Integer.parseInt(sc.next());
            if(n==0)break;
            String uhyo[][] = new String[n][2];
            for(int i=0;i<n;i++){
                uhyo[i][0]=sc.next();
                uhyo[i][1]=sc.next();
            }
            int m =Integer.parseInt(sc.next());
            String[] guhyo = new String[m];
            for(int i=0;i<m;i++){
                String str = sc.next();
                guhyo[i] = str;
            }
            //System.out.println(uhyo[2][1]);
            run(n,uhyo,m,guhyo);
        }
    }
    
    public static void run(int n,String[][] uhyo,int m,String[] guhyo){
        
        HashMap<String,String> henkan = new HashMap<String,String>();

        for(int i=0;i<n;i++){
            henkan.put(uhyo[i][0], uhyo[i][1]);
        }
            
        for(int i=0;i<m;i++){
            if(henkan.containsKey(guhyo[i])){
            
                System.out.print(henkan.get(guhyo[i]));
            }else{
                System.out.print(guhyo[i]);
            }
                
        }
        System.out.println();
        
        
    }
}