import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static boolean debug = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        ArrayList<MyList> list = new ArrayList<>();
        ArrayList<Integer> exist = new ArrayList<>();

        for(int i = 1; i<n; i++){
            int p = sc.nextInt();
            int c = sc.nextInt();

            MyList parent=null;
            MyList child=null;
            if(!exist.contains(p)){
                parent = new MyList(p);
                exist.add(p);
                list.add(parent);
            }else{
                for(MyList temp : list){
                    if(temp.me == p) {
                        parent = temp;
                        break;
                    }
                }
            }
            if(!exist.contains(c)){
                child = new MyList(c);
                exist.add(c);
                list.add(child);
            }else{
                for(MyList temp : list){
                    if(temp.me == c) {
                        child = temp;
                        break;
                    }
                }
            }

            parent.add(c);

        }


        for(int i = 0; i<q; i++) {
            int node = sc.nextInt();
            int score = sc.nextInt();

            for(MyList temp : list){
                if(temp.me == node) {
                    temp.addScore(score);
                    break;
                }
            }

        }

//        for(MyList m: list){
//            System.out.println("m:" + m);
//        }

        StringBuffer sb = new StringBuffer();

        for(MyList m : list) {
            for(int i :m.list){
                for(MyList c : list) {
                    if(c.me == i){
                        c.score = c.score + m.score;
                    }
                }
            }

        }

        for(MyList m: list){
            System.out.print(m.score + " ");
        }



        /*
        1 - 2 - 4
                5

          - 3 - 6



         */


    }
    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }
}

class MyList{
    int me =0;
    int score = 0;
    ArrayList<Integer> list = new ArrayList<>();

    public MyList(int me){
        this.me = me;
    }

    public void addScore(int i){
        this.score = this.score + i;
    }

    public void add(int i){
        list.add(i);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[" + me + ":" +score + "](");
        for(Integer i:list){
            sb.append(i).append(",");
        }
        sb.append(")");
        return sb.toString();
    }
}