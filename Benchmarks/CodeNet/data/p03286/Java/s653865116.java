import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();
        int a = 1;
        List<Integer> list = new ArrayList<>();
        int count = 0;
        while(N != 0){
            if(N % (2*a) != 0)
                list.add(1);
            else
                list.add(0);
            N -= list.get(count) * Math.pow(-2, count);
            a *= 2;
            count++;
        }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(list.size()-1-i));
        }

    }
}