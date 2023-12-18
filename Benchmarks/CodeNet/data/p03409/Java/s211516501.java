import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map <Integer,Integer>list_ab = new HashMap<Integer,Integer>();
        Map <Integer,Integer>list_cd = new HashMap<Integer,Integer>();
        for(int a=0;a<n;a++){
            int num_a = sc.nextInt();
            int num_b = sc.nextInt();
            list_ab.put(num_a,num_b);
        }
        int num=0;
        for(int a=0;a<n;a++){
            int num_a = sc.nextInt();
            int num_b = sc.nextInt();
            for(int b=num_a-1;b>0;b--){
                if(list_ab.containsKey(b)){
                  if(list_ab.get(b)<num_b){
                      num++;
                      list_ab.remove(b);
                      break;
                  }
                }
            }
        }
        System.out.println(num);
         }
}
