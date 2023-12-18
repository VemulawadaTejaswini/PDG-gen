import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();//3
        int box = a;
        int b = sc.nextInt();//5
        int t = sc.nextInt();//7
        t += 1;//t=8
        int count = 0;
        ArrayList<Integer> time = new ArrayList<>();
        time.add(a);//time=3,
        for(int i = a;a < t;){//3 < 7True,6<8Trues
            a = a * 2;//
            time.add(a);
            i = a;
            a--;
        }
        a = box;//
        if(a <= t){//
            for(int i : time){//
                if(i > t){//
                    break;
                }
                ++count;
            }
        }
        System.out.println(b * count);
    }
}