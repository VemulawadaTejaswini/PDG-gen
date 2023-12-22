import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> clover = new ArrayList<Integer>();
        List<Integer> spade = new ArrayList<Integer>();
        List<Integer> hart = new ArrayList<Integer>();
        List<Integer> dia = new ArrayList<Integer>();
        String cou = br.readLine();
        int count = Integer.parseInt(cou);
        int i=0;
        while(i<count) {
            String line = br.readLine();
            String[] line2 = line.split(" ");
            if(line2[0].equals("S")) {
                spade.add(new Integer(line2[1]));
            }else if(line2[0].equals("H")) {
                hart.add(new Integer(line2[1]));
            }else if(line2[0].equals("C")) {
                clover.add(new Integer(line2[1]));
            }else if(line2[0].equals("D")) {
                dia.add(new Integer(line2[1]));
            }
            i++;
        }
        List<Integer> clover_e = check(clover);
        List<Integer> spade_e = check(spade);
        List<Integer> hart_e = check(hart);
        List<Integer> dia_e = check(dia);
        print("S",spade_e);
        print("H",hart_e);
        print("C",clover_e);
        print("D",dia_e);
        
    }
    static void print(String mark,List<Integer> list) {
        for(int i=0;i<list.size();i++) {
            System.out.print(mark + " " + list.get(i));
            System.out.println();
        }
    }
    //絵柄がスペード、ハート、クラブ、ダイヤの順番で優先的に出力する。
    static List<Integer> check(List<Integer> list) {
        List<Integer> lack = new ArrayList<Integer>();
        int[] expect = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        for(int i=0;i<expect.length;i++) {
            lack.add(new Integer(expect[i]));
        }
        lack.removeAll(list);
        return lack;
    }
}