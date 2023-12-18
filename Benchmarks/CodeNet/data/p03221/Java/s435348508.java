import java.util.*;

public class Main{

    static int NN;
    static int MM;

    static TreeSet<Num> solution;
    public static void main(String args[]) throws Exception {
      

        Scanner sc = new Scanner(System.in);

        NN= sc.nextInt();
        MM= sc.nextInt();


        solution = new TreeSet<>(new sortIndex());
        List<TreeSet<Num>> kk = new ArrayList<>();
        for (int i = 0; i < NN; i++) {
            kk.add(new TreeSet<>(new sortNum()));
        }
        for (int i = 0; i < MM; i++) {
            int n =sc.nextInt();
            kk.get(n-1).add(new Num(n,sc.nextInt(),i,null));
        }

        for (int i = 0; i < NN; i++) {
            format(kk.get(i));
        }


        Iterator it = solution.iterator();
        while (it.hasNext()) {
            Num n = (Num)it.next();
            System.out.println(n.getStr());
        }


    }
    static void format(TreeSet<Num> list){
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()){
            Num n = (Num)it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%06d", n.N)).append(String.format("%06d", (++i)));
            n.setStr(sb.toString());
            solution.add(n);

        }


    }
    static class Num{
        public int N;
        public int M;
        public int oldIndex;
        public String str;

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