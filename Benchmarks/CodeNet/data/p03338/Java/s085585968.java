import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),max=0;
        String S=sc.next();
        HashMap<String,Integer>x=new HashMap<>(),y=new HashMap<>();
        for(int i=0;i<N;i++){
            String T=String.valueOf(S.charAt(i));
            if(!x.containsKey(T)){
                x.put(T,1);
            }else{
                x.put(T,x.get(T)+1);
            }
        }
        for(int i=0;i<N;i++){
            String T=String.valueOf(S.charAt(i));
            if(!y.containsKey(T)){
                y.put(T,1);
            }
            else{
                y.put(T,y.get(T));
            }
            x.put(T,x.get(T)-1);
            if(x.get(T)==0){
                x.remove(T);
                y.remove(T);
            }
            max=Math.max(max,Math.min(x.size(),y.size()));
        }
        System.out.println(max);
    }
}