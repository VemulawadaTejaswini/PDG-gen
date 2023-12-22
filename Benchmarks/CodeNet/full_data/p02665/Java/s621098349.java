import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
        int n= Integer.parseInt(scan.next());
        int cnt=0;
        for(int i=0;i<n+1;i++){
            int wk= Integer.parseInt(scan.next());
            if(tm.get(wk)!=null ){
                for(int j=wk;true;j++){
                    if(tm.get(j)==null){
                        for(int k=0;k<2;k++,cnt++){
                            tm.put(j,cnt);
                        }
                        break;
                    }
                }
            }else{
                for(int k=0;k<2;k++,cnt++){
                    tm.put(wk,cnt);
                }
            }
            
            
            
        }
        System.out.println(tm);
    }
}
