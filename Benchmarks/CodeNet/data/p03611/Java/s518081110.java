import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),res=0;
        HashMap<Integer,Integer> c=new HashMap<>();
        for(int i=0;i<N;i++){
            int t=sc.nextInt();
            for(int j=-1;j<=1;j++){
                if(!c.containsKey(t+j)){
                    c.put(t+j,1);
                }else{
                    c.put(t+j,c.get(t+j)+1);
                }
            }
        }
        for(int i:c.keySet()){
            res=Math.max(res,c.get(i));
        }
        System.out.println(res);
    }
}