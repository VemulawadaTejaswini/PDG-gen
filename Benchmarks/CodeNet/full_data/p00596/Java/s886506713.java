import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int num,a,b,count,temp;
        count=0;
        boolean[] odd = new boolean[7];
        String str;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.reset();
        ArrayList<Integer> list = new ArrayList<Integer>(7){{
            add(0);add(0);add(0);add(0);add(0);add(0);add(0);
        }};
        for(int i = 0 ; i < num ; i++){
            str = sc.next();
            a = Integer.parseInt(str.substring(0,1));
            b = Integer.parseInt(str.substring(1,2));
            if(a!=b) {
                temp = list.get(a);
                list.set(a, temp + 1);
                temp = list.get(b);
                list.set(b, temp + 1);
            }
        }
        for(int i=0 ; i<7; i++){
            if(list.get(i)%2!=0){
                odd[i] = true;
                count++;
            }else{
                odd[i] = false;
            }

        }
        if(count==0 || count==2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}