import java.util.*;

class Main{
    static int num = 200000;
    static int[] hoge = new int[num];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> human = new HashMap<>();
        int[] a = new int[n+1];
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
            
        }

        int count = 0;
        for(int i=1;i<=n;i++){
            Integer v = a[i] + i;
            if(human.containsKey(v)){
                human.put(v, human.get(v)+1);
            }
            else{
                human.put(v, 1);
            }
        }        
        for(int i=1;i<=n;i++){
            Integer v = i - a[i];
            if(human.containsKey(v)){
                count += human.get(v);
            }
        } 
        
        
        System.out.println(count);

    }
}
