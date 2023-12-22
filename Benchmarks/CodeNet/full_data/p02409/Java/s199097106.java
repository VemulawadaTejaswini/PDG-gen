import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cou = br.readLine();
        int count = Integer.parseInt(cou);
        int[][] t1 = new int[3][10];
        int[][] t2 = new int[3][10];
        int[][] t3 = new int[3][10];
        int[][] t4 = new int[3][10];
        int i=0;
        init(t1);
        init(t2);
        init(t3);
        init(t4);
        while(i<count) {
            String line = br.readLine();
            String[] line2 = line.split(" ");
            switch(Integer.parseInt(line2[0])) {
                case 1:
                    add(t1,Integer.parseInt(line2[1]),Integer.parseInt(line2[2]),Integer.parseInt(line2[3]));
                    break;
                case 2:
                    add(t2,Integer.parseInt(line2[1]),Integer.parseInt(line2[2]),Integer.parseInt(line2[3]));
                    break;
                case 3:
                    add(t3,Integer.parseInt(line2[1]),Integer.parseInt(line2[2]),Integer.parseInt(line2[3]));
                    break;
                case 4:
                    add(t4,Integer.parseInt(line2[1]),Integer.parseInt(line2[2]),Integer.parseInt(line2[3]));
                    break;
                default:
                    break;
            }
            i++;
        }
        print(t1);
        punc();
        print(t2);
        punc();
        print(t3);
        punc();
        print(t4);
    }
    static void init(int[][] ary) {
        for(int i=0;i<ary.length;i++) {
            for(int j=0;j<ary[i].length;j++) {
                ary[i][j]=0;
            }
        }
    }
    static void print(int[][] tag) {
        for(int i=0;i<tag.length;i++) {
            for(int j=0;j<tag[i].length;j++) {
                System.out.print(" " + tag[i][j]);
            }
            System.out.println();
        }
    }
    static void punc() {
        System.out.println("####################");
    }
    //1 1 3 8 1棟1階3番目の部屋に+8人
    static void add(int[][] ren,int floor,int room,int num) {
            ren[floor-1][room-1] += num;
    }
  
}