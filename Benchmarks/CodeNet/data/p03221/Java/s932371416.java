import java.io.FileInputStream;
import java.util.*;

public class Main{

    static int NN;
    static int MM;
    static List<Num> list1;
    public static void main(String args[]) throws Exception {

 
        Scanner sc = new Scanner(System.in);

        NN= sc.nextInt();
        MM= sc.nextInt();

        list1 = new ArrayList<>();
        List<List<Num>> kk = new ArrayList<>();
        for (int i = 0; i < NN; i++) {
            kk.add(new ArrayList<>());
        }
        for (int i = 0; i < MM; i++) {
            int n =sc.nextInt();
            kk.get(n-1).add(new Num(n,sc.nextInt(),i,null));
        }

        for (int i = 0; i < kk.size(); i++) {
            format(kk.get(i));
        }

        Collections.sort(list1,new sortIndex());
        for (int j = 0; j < list1.size(); j++) {
            System.out.println(list1.get(j).getStr());
        }


    }
    public static void format(List<Num> list){
        Collections.sort(list,new sortNum());
        for (int i = 0; i < list.size(); i++) {
            Num data =list.get(i);
            data.setStr(String.format("%06d", data.N) + String.format("%06d", (i+1)));
            list1.add(data);
        }

    }
    static class Num{
        public int N;
        public int M;
        public int oldIndex;
        public String str;
        public Num(){

        }
        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }

        public Num(int n, int m, int oldIndex, String str) {
            N = n;
            M = m;
            this.oldIndex = oldIndex;
            this.str = str;
        }
    }
    static class sortNum implements Comparator<Num>{
        @Override
        public int compare(Num o1, Num o2) {
            return o1.M-o2.M;

        }
    }

    static class sortIndex implements Comparator<Num>{
        @Override
        public int compare(Num o1, Num o2) {
            return o1.oldIndex-o2.oldIndex;

        }
    }

}