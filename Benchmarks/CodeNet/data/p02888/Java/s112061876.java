import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            arr.add(sc.nextInt());
        }
        
        arr.sort((a,b)->{return a-b;});
        long ans = 0l;
        int a,b,c;
        for(int i=0;i<N;i++){
            a = arr.get(i);
            start:for(int j=i+1;j<N;j++){
                b = arr.get(j);
                for(int k=j+1;k<N;k++){
                    c = arr.get(k);
                    if(c<a+b && a<b+c && b<a+c){
                        ans++;
                    }else{
                        continue start;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
