import java.util.*;
public class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList();
        for(int i=0;i<N;i++){
            list.add(sc.nextInt());
        }
        int result = 0;
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            //Iterator<Integer> it2 = list.iterator();
            int num = it.next();
            it.remove();
            result++;
            while(it.hasNext()){
                int num2 = it.next();
                if(num < num2){
                    it.remove();
                    num = num2;
                }
            }
            //it.remove();
            //result++;
            it = list.iterator();
        }
        System.out.println(result);
    }
}