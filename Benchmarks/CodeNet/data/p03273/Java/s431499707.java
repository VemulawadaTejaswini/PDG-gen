import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int w = s.nextInt();
        s.nextLine();
        List<String> list = new LinkedList<>();
        int a = h;
        for (int i = 0; i < h; i++) {
             String ss = s.nextLine();
             if(ss.contains("#")) {
                 list.add(ss);
             } else {
                 a--;
             }
        }



        for(int i=0;i<w;i++) {
            int j = 0;
            for(;j<a;j++) {
                if(list.get(j).charAt(i)=='#') {
                    break;
                }
            }
            if(j==a) {
                for(int k=0;k<a;k++) {
                    StringBuilder sb = new StringBuilder(list.get(k));
                    sb.deleteCharAt(i);
                    list.remove(k);
                    list.add(k,new String(sb));
                }
                w--;
            }
        }
        for(int i=0;i<a;i++) {
            System.out.println(list.get(i));
        }
    }
}