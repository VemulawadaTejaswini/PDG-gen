import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        List<Integer> kList = new ArrayList<>();
        List<Integer> oneList = new ArrayList<>();
        
        boolean f = true;
        int z = 0;
        int one = 0;
        for(int i = 0; i < n; i++){
            z++;
            char c = s.charAt(i);
            if(c == '1'){
                if(f){
                    one++;
                }else{
                    f = true;
                    kList.add(z - 1);
                    oneList.add(one);
                    one = 1;
                }
            }else{
                f = false;
            }
        }
        
        if(f){
            kList.add(0);
            oneList.add(one);
        }else{
            kList.add(z - 1);
            oneList.add(one);
            oneList.add(0);
        }

        long max = 0;
        int index = -1;
        for(int i = k - 1; i < oneList.size() - 1; i++){
            long tmp = 0;
            if(index == -1){
                tmp = kList.get(i) + oneList.get(i + 1);
            }else{
                tmp = kList.get(i) + oneList.get(i + 1) - kList.get(index);
            }
            if(max < tmp){
                max = tmp;
            }
            index++;
        }
        
        if(max == 0){
            max = n;
        }
        
        System.out.println(max);
        
        
        
    }
}
