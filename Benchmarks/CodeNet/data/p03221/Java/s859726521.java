import java.io.FileInputStream;
import java.util.*;

public class Main {

    static int NN;
    static int MM;
    static String [] index;
    static List<Num> list1;
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        long start = System.currentTimeMillis();
        NN= sc.nextInt();
        MM= sc.nextInt();
        index = new String[MM];

        List list = new ArrayList<>();
        list1 = new ArrayList<>();
        for (int i = 0; i < MM; i++) {
            Num nu = new Main().new Num(sc.nextInt(),sc.nextInt(),i,null);
            list.add(nu);
        }
        Collections.sort(list,new Main().new sortNum());
        List<List<Num>> kk = divider(list,new Main().new groupNum());

        for (int i = 0; i < kk.size(); i++) {
            new Main().format(kk.get(i));
        }

        Collections.sort(list1,new Main().new sortIndex());
        for (int j = 0; j < list1.size(); j++) {
            System.out.println(list1.get(j).getStr());
        }


    }
    public  void format(List<Num> list){

        for (int i = 0; i < list.size(); i++) {

            Num data =list.get(i);

            String string = String.format("%06d", data.N) + String.format("%06d", (i+1));
            data.setStr(string);
            list1.add(data);
        }

    }
    class Num{
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

        public Num(int n, int m) {
            N = n;
            M = m;
        }

        public Num(int n, int m, int oldIndex, String str) {
            N = n;
            M = m;
            this.oldIndex = oldIndex;
            this.str = str;
        }
    }
    class sortNum implements Comparator<Num>{
        @Override
        public int compare(Num o1, Num o2) {
            return o1.M-o2.M;

        }
    }

    class sortIndex implements Comparator<Num>{
        @Override
        public int compare(Num o1, Num o2) {
            return o1.oldIndex-o2.oldIndex;

        }
    }

    class groupNum implements Comparator<Num>{

        @Override
        public int compare(Num o1, Num o2) {
            return o1.N - o2.N;
        }
    }

    public static  <T> List<List<T>> divider(Collection<T> datas,Comparator<T> c) {
        List<List<T>> result = new ArrayList<List<T>>();
        for(T t:datas) {
            boolean bool = false;
            for(int j=0;j<result.size();j++) {
                if(c.compare(t, result.get(j).get(0))==0) {
                    bool = true;
                    result.get(j).add(t);
                    break;
                }
            }
            if (!bool) {
                List<T> li = new ArrayList<T>();
                result.add(li);
                li.add(t);
            }
        }
        return result;
    }

}
